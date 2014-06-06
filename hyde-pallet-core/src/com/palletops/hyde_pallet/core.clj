(ns com.palletops.hyde-pallet.core
  (:require [palletops.hyde :as hyde]
            [clojure.edn :as edn]
            [clojure.java.io :refer [resource file as-file]]
            [com.palletops.hyde-pallet.tags :as tags]
            [com.palletops.hyde-pallet.api :as api]
            [com.palletops.api-builder.api :refer [defn-api]]
            [schema.core :as s]))


(defn deep-merge
  "Recursively merge maps."
  [& ms]
  (letfn [(f [a b]
            (if (and (map? a) (map? b))
              (deep-merge a b)
              b))]
    (apply merge-with f ms)))

;;; build a pallet site

(defn-api build-site
  {:sig [[s/Any s/Any s/Any :- s/Any]]}
  [root template project]
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
                         #_(:hyde project))
        {:keys [jekyll-config tag-map data-files documents site-config
                context]} site]
    (hyde/create-collections-dirs! root site-config)
    (hyde/write-gemfile! root jekyll-config)
    (hyde/write-config! root site-config)
    (when project
      (hyde/write-data! root "lein" project))
    (binding [hyde/*tag-map* (merge tag-map tags/tags)
              hyde/*context* (merge hyde/*context* context)]
      (let [;; rebuild the site with the bindings, as some of them are
            ;; used (e.g. api)
            site (template-site project)]
        (hyde/copy-resources! root site-config)
        (doseq [[name data-map] data-files]
          (hyde/write-data! root name data-map))
        (doseq [doc documents]
          (hyde/write-document! root doc))))))
