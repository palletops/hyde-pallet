(ns com.palletops.hyde-pallet.core
  (:require [palletops.hyde :as hyde]
            [clojure.edn :as edn]
            [clojure.java.io :refer [resource file as-file]]
            [com.palletops.hyde-pallet.tags :as tags]
            [com.palletops.hyde-pallet.api :as api]))


(defn deep-merge
  "Recursively merge maps."
  [& ms]
  (letfn [(f [a b]
            (if (and (map? a) (map? b))
              (deep-merge a b)
              b))]
    (apply merge-with f ms)))

;;; build a pallet site

(defn build-site [root template & [project]]
  (let [template (if (keyword? template) (name template) template)
        the-ns (symbol (format "palletops.hyde.site.%s" template))
        _ (try (require the-ns)
               (catch Exception e
                 (throw (ex-info (format "Template '%s' not found in" template )
                                 {:type :config}))))
        template-site (->> template
                           (format  "palletops.hyde.site.%s/site")
                           symbol
                           resolve
                           var-get)
        site (deep-merge (template-site project)
                         (:hyde project))
        _ (printf "Final site config:\n----\n%s\n----\n"
                  (with-out-str (clojure.pprint/pprint site)))
        {:keys [jekyll-config tag-map data-files documents site-config]} site]
    (hyde/create-collections-dirs! root site-config)
    (hyde/write-gemfile! root jekyll-config)
    (hyde/write-config! root site-config)
    (binding [hyde/*tag-map* (merge tag-map tags/tags)
              ;; TODO: this binding of *api* needs to be moved out to the template
              api/*api* (api/load-api)]
      (try (hyde/write-data! root "api-doc" api/*api* {})
           (catch Exception e
             (println "Could not save api data:")
             (clojure.pprint/pprint api/*api*)))
      (hyde/copy-resources! root site-config)
      (doseq [[name data-map] data-files]
        (hyde/write-data! root name data-map))
      (doseq [doc documents]
        (hyde/write-document! root doc)))))
