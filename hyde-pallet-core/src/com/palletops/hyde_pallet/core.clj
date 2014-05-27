(ns com.palletops.hyde-pallet.core
  (:require [palletops.hyde :as hyde]
            [clojure.walk :refer [postwalk]]
            [clojure.edn :as edn]
            [clojure.java.io :refer [resource file as-file]]
            [clojure.string :as string]
            [com.palletops.docudata.extract :as docudata]))

(def jekyll-config
  {:gems
   [{:gem "jekyll" :version "2.0.3"}
    {:gem "rouge" :version "~> 1.3"}
    {:gem "coderay"}]})

(def site-config
  {:template :crate
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


(defn clean-api [api-doc]
  (let [;; if `d` is a map, replace the value for key `k` with the
        ;; results of applying the function `fk` to it
        swapper (fn [d k fk]
                  (if-let [v (k d)]
                    (assoc d k (fk v))
                    d))
        ;; turn all symbols into strings
        clean-arglists (fn [al]
                         (postwalk (fn [x] (if (symbol? x) (str x) x)) al))
        indent-md-headers (fn [d] (-> d
                                     (string/replace #"^#" "###")
                                     (string/replace #"\n#" "\n###")))
        clean (fn [d]
                (-> d
                    (swapper :ns str)
                    (swapper :name str)
                    (swapper :var-type (comp str name))
                    (swapper :ns-name str)
                    (swapper :arglists clean-arglists)
                    (swapper :doc indent-md-headers)))]
    (postwalk clean api-doc)))

(defrecord Project [project])
(defmethod hyde/render Project [p]
  (format "[%s](http://github.com/pallet/%s)" (:project p) (:project p)))

(def ^:dynamic *api* {})

;; #dd/start test
(defrecord Snippet [snippet])
(defmethod hyde/render Snippet [s]
  (let [snippets (:snippets api)
        key (keyword (:snippet s))]
    (:content (get snippets key))))
;; #dd/end

(defn build-site [root jekyll-config site-config]
  (hyde/create-collections-dirs! root site-config)
  (hyde/write-gemfile! root jekyll-config)
  (hyde/write-config! root site-config)
  (hyde/copy-resources! root site-config)
  (hyde/write-document! root {:path "_posts/2012-01-01-my-example.md"
                              :content "this is a *test*!"
                              :front-matter
                              {:title "This is the document"
                               :index 1}})
  (hyde/write-data!
   root "topbar-menu"
   {:brand "Sample Crate"
    :main-options
    [{:title "Home" :href "/"}
     {:title "Documentation" :href "/README.html"}
     {:title "API" :href "/api.html"}
     {:title "About" :href "/about"}]})

  (binding [hyde/*tag-map* {'pallet/project #'->Project
                            'hyde/snippet #'->Snippet}
            *api* (clean-api
                  ;; TODO: the source paths should come from the project
                  {:namespaces (doall (docudata/docudata ["src"] {}))
                   :snippets (doall (docudata/snippets-in-path "."))}
                  ;;(edn/read-string (slurp "target/docudata.edn"))
                  )]
    (hyde/write-data! root "api-doc" *api*)
    (hyde/write-collection!
     root
     "api"
     {:index-key :my-index
      :docs [{:path "doc-a.md"
              :front-matter
              {:title "doc a"
               :layout "default"}
              :content "this is doc *a*"}
             {:path "doc-b.md"
              :front-matter
              {:title "doc b"
               :layout "default"}
              :content "this is verbatim *b* [* #pallet/project pallet *]"}]})
    (hyde/write-document!
     root
     {:path "README.md"
      :front-matter {:title "hyde-pallet" :layout "doc"}
      :content (slurp "README.md")})
    (hyde/write-document!
     root
     {:path "example.md"
      :front-matter {:title "Example" :layout "doc"}
      :content (slurp "doc-src/example.md")})))
