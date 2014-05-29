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
                    (swapper :tag (constantly "")) ;; currently killing it
                    (swapper :sig clean-arglists)
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
  (let [snippets (:snippets *api*)
        key (keyword (:snippet s))]
    (:content (get snippets key))))
;; #dd/end

(defn render-table [[headers rows]]
  (str
   "<table class='table'><thead><tr>\n"
   (apply str (map #(format "<th>%s</th>\n" %) headers) )
   "</tr></thead>\n"
   "<tbody>\n"
   (apply str
          (map
           #(format "<tr>%s</tr>\n"
                    (apply str
                           (map
                            (fn [x]
                              (str "<td>{% capture content %}"
                                   x
                                   "{% endcapture %}{{ content | markdownify }}</td>"))
                            %)))
           rows))
   "</tbody></table>\n"))

(defrecord Table [table])
(defmethod hyde/render Table [t]
  (render-table (:table t)))

(defn get-api
  ([api name]
     (let [nss (map :vars (:namespaces api))
           hits (mapcat (partial filter #(= name (:name %))) nss)
           hitn (count hits)]
       (cond
        (> hitn 1) (throw
                    (ex-info
                     (format "The api name %s appears in more than one namespace: %s"
                             name
                             (map :ns hits))
                     {}))
        (= hitn 1) (first hits)
        (= hitn 0) (throw
                    (ex-info
                     (format "the api name %s is not found" name)
                     {}))))))

(defrecord Api-Link [name])
(defmethod hyde/render Api-Link [api]
  (let [entry (get-api *api* (:name api))]
    (format "[%s](/api.html#%s)" (:name api) (:name api))))

(defrecord Api-Entry [name])
(defmethod hyde/render Api-Entry [api]
  (let [entry (get-api *api* (:name api))]
    (str "<div class='bg-info'>"
     (format "<code class='bg-info'>%s/%s: %s </code>"
             (:ns entry)
             (:name entry)
             (with-out-str (clojure.pprint/pprint (:arglists entry))))
     "<br>where:<br>"
     (render-table [["Parameter" "Description"] [["api-doc" "Documentation on this api doc"]]])
     "</div>")))

(defn load-api []
  (clean-api
   ;; TODO: the source paths should come from the project
   {:namespaces (doall (docudata/docudata ["src"] {}))
    :snippets (doall (docudata/snippets-in-path "."))}))

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
     {:title "Example" :href "/example.html"}]})

  (binding [hyde/*tag-map* {'pallet/project #'->Project
                            'hyde/snippet #'->Snippet
                            'pallet/table #'->Table
                            'pallet/api-link #'->Api-Link
                            'pallet/api-entry #'->Api-Entry}
            *api* (load-api)]
    (hyde/write-data! root "api-doc" *api* {})
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
    #_(hyde/write-document!
     root
     {:path "example.md"
      :front-matter {:title "Example" :layout "doc"}
      :content (slurp "doc-src/example.md")})))

#_(defn build-site [root jekyll-config site-config]
;  (hyde/create-collections-dirs! root site-config)
;  (hyde/write-gemfile! root jekyll-config)
;  (hyde/write-config! root site-config)
                                        ;  (hyde/copy-resources! root site-config)
  (let [test (slurp "/tmp/test.edn")]
    (println test)
    (hyde/write-data! root "test" (clojure.edn/read-string test)))

  )
