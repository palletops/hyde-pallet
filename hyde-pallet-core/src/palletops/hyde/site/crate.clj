(ns palletops.hyde.site.crate
  (:require [com.palletops.hyde-pallet.api :as api]
            [me.raynes.fs :as fs]
            [scout.core :as scout]
            [clj-yaml.core :as yaml]))

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

(defn fm [c]
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

(defn docs-from-doc-src []
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

(defn site [{:keys [hyde] :as project}]
  (let [{:keys [title menu menu-extras]} (:hyde project)]
    (printf "hyde config:\n%s\n" (with-out-str (clojure.pprint/pprint (:hyde project))))
    {:jekyll-config jekyll-config
     :site-config site-config
     :data-files
     {"topbar-menu"
      {:brand (or title "Crate")
       :main-options
       (concat (or menu
                   [{:title "Home" :href "/"}
                    {:title "Documentation" :href "/README.html"}
                    {:title "API" :href "/api.html"}])
               menu-extras)}}
     :tag-map (api/tags)
     :context {:api (api-with-urls (api/load-api) project)
               :project project}
     :documents
     (concat (docs-from-doc-src)
             [{:path "README.md"
               :content (slurp "README.md")
               :front-matter {:title "hyde-pallet" :layout "doc"}}])}))

