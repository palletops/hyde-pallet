(ns leiningen.hyde
  (:require
   [clojure.java.io :refer [file]]
   [com.palletops.hyde-pallet.core
    :refer [build-site jekyll-config site-config]]
   [leiningen.core.eval :refer [eval-in-project]]
   [leiningen.core.project
    :refer [add-profiles merge-profiles unmerge-profiles]]
   [leiningen.docudata :refer [docudata]]))

(def profiles
  {::hyde
   {:dependencies [['com.palletops/hyde-pallet "0.1.0-SNAPSHOT"]]}})

(defn hyde-options
  [project]
  (merge
   {:template :crate
    :output-dir (.getPath (file (:target project) "hyde"))}
   (:hyde project)))

(defn hyde
  "Generate documentation site for clojure code."
  [project & args]
  (let [project (docudata project)
        project (if (get-in (meta project) [:profiles :hyde])
                  (merge-profiles project [:hyde])
                  project)
        project (-> project
                    (add-profiles profiles)
                    (merge-profiles [::hyde]))
        config (hyde-options project)]
    (build-site
     (:output-dir config)
     (merge jekyll-config (:jekyll config))
     (merge site-config (dissoc config :output-dir :jekyll)))))
