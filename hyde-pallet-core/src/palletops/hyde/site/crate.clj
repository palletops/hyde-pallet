(ns palletops.hyde.site.crate
  (:require [com.palletops.hyde-pallet.api :as api]
            [me.raynes.fs :as fs]
            [scout.core :as scout]
            [clj-yaml.core :as yaml]
            [clojure.string :as string]
            [carapace.shell :refer [sh-map]]
            [fipp.edn :refer [pprint]]))

(def resources
  ["index.html"
   "_includes/include.md"
   "_includes/head.html"
   "_includes/header.html"
   "_includes/footer.html"
   "_includes/scripts.html"
   "_includes/topbar-menu.html"
   "_layouts/default.html"
   "_layouts/page.html"
   "_layouts/doc.html"
   "api.md"
   "full-api.md"
   "local.css"
   "toc.js"
   "coderay.css"])

(def jekyll-config
  {:gems
   [{:gem "jekyll" :version "2.0.3"}
    {:gem "rouge" :version "~> 1.3"}
    {:gem "coderay"}]})

(def site-config
  {:template :crate ;; still needed
   :resources resources
   :config
   {:name "test site"
    :title "test title"
    :description "this si a long description"
;;    :highlighter "rouge"
    :markdown "kramdown"
    :kramdown {:use_coderay "true"
               :enable_coderay "true"
               :input "GFM"
               :hard_wrap "false"
               :coderay
               {:coderay_line_numbers "nil"
                :coderay_css "class"
                :coderay_wrap "div"
                :coderay_tab_width "2"
                :coderay_bold_every "false"}}
    :collections
    {:api
     {:output true
      :layout "post"}}}})

(defn fm
  "Given a content with jekyll's front matter, it returns a map of
  `#{:content :front-matter}` where `content` contains the content of
  the file without the front matter, and `:front-matter` contains a
  map with the parsed contents in the from-matter"
  [c]
  (let [fm-begin (-> c
                     (scout/scanner)
                     (scout/scan-until #"(?m)^---\s*$"))
        fm-end (-> fm-begin
                   (scout/remainder)
                   (scout/scanner)
                   (scout/scan-until #"(?m)^---\s*$"))]
    (if (and (-> fm-begin :match)
             (-> fm-end :match))
      ;; we have a match for the front matter
      (let [fm-first  (-> fm-begin :match :end)
            front-matter-yaml (subs c
                                    fm-first
                                    (+ fm-first (-> fm-end :match :start)))
            front-matter (yaml/parse-string front-matter-yaml)
            content (subs c (+ fm-first (-> fm-end :match :end)))]
        {:content content
         :front-matter front-matter})
      ;; no front matter found
      {:content c
       :front-matter nil})))

(defn docs-from-doc-src
  "builds the doc map from files in `doc-src` repo inside the
  project's root dir"
  []
  (let [files (fs/list-dir "doc-src")]
    (map (fn [f]
           (let [{:keys [content front-matter]} (fm (slurp (format "doc-src/%s" f)))]
             {:content content
              :path f
              :front-matter (merge
                             ;; default to 'doc' layout
                             {:layout "doc"}
                             ;; if it doesn't have title, add a title
                             (when-not (get :title front-matter)
                               {:title f})
                             front-matter)}))
         files)))

(defn api-base-url
  "Get's the base url for source files in the public web repo"
  [api project]
  (let [project-scm-url (-> project :scm :url)
        base-url (-> project :hyde :scm-base-url)]
    (or base-url
        project-scm-url
        (do
          (println "There is no base url for the API srouces")
          nil))))

(defn arglist-str [name arglists]
  (let [calls (for [arglist arglists] (cons name arglist))]
    (string/trim-newline
     (apply str
            (map #(with-out-str (pprint %)) calls)))))

(defn sig-str [sig]
  (string/trim-newline
   (apply str
          (map #(with-out-str (pprint %)) sig))))

(defn safe-id [ns name]
  (let [safe-ns (string/replace ns #"[^\w]" "-")
        safe-name (string/replace name #"[^\w]" "-")]
   (str safe-ns "_" safe-name)))

(defn api-with-urls
  "Update api var entries with source urls. It uses the project
  information, specifically `[:hyde :branch]`
  and `[:hyde :scm-base-url]`. `:branch` should be the current
  repository's branch, and `:scm-base-url` should be the base url that
  points at the project's file."
  [api project]
  (let [base-url (api-base-url api project)
        branch (or (-> project :hyde :branch) "master")
        var-with-url
        #(let [{:keys [file line arglists name sig doc]} %]
           (assoc %
             :src-url (format "%s/blob/%s/src/%s#L%s" base-url branch file line )
             :arglists-str (when arglists (arglist-str name arglists))
             :sig-str (when sig (sig-str sig))
             :doc (when doc (string/replace doc #"(?s)#.*Function Signatures(.|$)*" ""))
             :id (safe-id (:ns %) (:name %))))
        vars-with-urls (map var-with-url (:vars api))]
    (assoc api :vars vars-with-urls)))

(defn filter-api [{:keys [vars namespaces] :as api} ff]
  (let [filtered-vars (filter ff vars)
        filtered-namespaces (into #{} (map #(get % :ns-name) filtered-vars))
        filtered-namespace-entries (filter #(filtered-namespaces (:ns-name %))
                                           namespaces)]
    (println "filtered vars=" filtered-vars)
    (println "filtered ns=" filtered-namespaces)
    (println "namespaces=" filtered-namespace-entries)
    (assoc api
      :vars filtered-vars
      :namespaces filtered-namespace-entries)))

(defn local-git-branch
  "Get current git repo branch (via git binary run locally)"
  []
  (let [{:keys [out err exit]} (sh-map ["git" "rev-parse" "--abbrev-ref" "HEAD"] {})]
    (if exit
      (string/trim out)
      (do
        (printf "Cannot get local git branch: %s\n" err)
        nil))))

(defn local-git-origin
  "Get the repo's origin url (via git binary run locally)"
  []
  (let [{:keys [out err exit]} (sh-map ["git" "config" "--get" "remote.origin.url"] {})]
    (if exit
      (string/trim out)
      (do
        (printf "Cannot get origin repo's url: %s\n" err)
        nil))))

(defn git-url->github-url
  "Convert a git url into a github repository url"
  [url]
  (let [rx #"^(?:https?:\/\/|git:\/\/)?(?:[^@]+@)?(gist.github.com|github.com)[:\/]([^\/]+\/[^\/]+?|[0-9]+)$"
        url (string/replace url ".git" "")
        [_ host project] (re-find rx url)]
    (format "https://%s/%s" host project)))

(defn local-info
  "Information obtained from local files"
  []
  (let [git-url (local-git-origin)
        branch (local-git-branch)]
    {:scm-base-url (git-url->github-url git-url)
     :branch branch}))

(defn site
  "Builds the site map with information gathered from the project.

  TODO: describe configuration options at the project level."
  [project]
  (let [hyde-config (merge (local-info) (:hyde project))
        {:keys [title menu menu-extras scm-base-url branch]} hyde-config
        ;; update the project with the local info
        project (assoc project :hyde hyde-config)
        api (api-with-urls (api/load-api) project)
        filtered-api (filter-api (api/clean-api api) :api)
        full-api (api/clean-api api)
        use-api-builder? (< 0 (count (:vars filtered-api)))]
    {:jekyll-config jekyll-config
     :site-config site-config
     :data-files
     {"topbar-menu"
      {:brand (or title (:name project))
       :main-options
       (concat
        ;; if a :menu entry is supplied, use it instead of the
        ;; defaults
        (or menu
            (let [add-public-api
                  ;; only add public if (:vars filtered-api) is not empty
                  #(if use-api-builder?
                     (conj % {:title "Public API" :href "/api.html"})
                     %)
                  add-full-api
                  #(conj % {:title (if use-api-builder? "Full API" "API")
                         :href "/full-api.html"})]
              (-> []
                  (conj {:title "Home" :href "/"})
                  (conj {:title "Documentation" :href "/README.html"})
                  add-public-api
                  add-full-api
                  (conj {:title "GitHub" :href (format "%s/tree/%s" scm-base-url branch)}))))
        ;; add the menu extras to whatever is the menu
        menu-extras)}
      "api-doc" filtered-api
      "full-api-doc" full-api}
     :tag-map (api/tags)
     :context { ;; update api with urls to sources
               :api api
               :project project}
     :documents
     (concat (docs-from-doc-src)
             [{:path "README.md"
               :content (slurp "README.md")
               :front-matter {:title "hyde-pallet" :layout "doc"}}])}))

(comment
  ":hyde entry in projec.clj"
  {:hyde
   {:title "maven crate"
    :scm-base-url "https://github.com/pallet/maven-crate"
    :branch "feature/pallet-0.8"
    :menu [{:title "Home" :href "/"}
full-api           {:title "Documentation" :href "/README.html"}
           {:title "API" :href "/api.html"}]
    :menu-extras [{:title "Example" :href "/example.html"}]
    :data-files {"topbar-menu"
                 {:brand "MAVEN CRATE"}}}})
