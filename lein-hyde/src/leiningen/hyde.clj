(ns leiningen.hyde
  (:require
   [clojure.java.io :refer [file]]
   [leiningen.core.eval :refer [eval-in-project]]
   [leiningen.core.main :refer [info]]
   [leiningen.core.project
    :refer [add-profiles merge-profiles unmerge-profiles]]))

(def profiles
  {::hyde
   {:dependencies [['com.palletops/hyde-pallet "0.1.0-SNAPSHOT"]]}})

(defn hyde-options
  [project]
  (merge
   {:template :crate
    :output-dir (.getPath (file (:target-path project) "hyde"))}
   (:hyde project)))

(defn hyde
  "Generate documentation site for clojure code."
  [project & args]
  (let [project (if (get-in (meta project) [:profiles :hyde])
                  (merge-profiles project [:hyde])
                  project)
        project (-> project
                    (add-profiles profiles)
                    (merge-profiles [::hyde]))
        config (hyde-options project)]
    (info "Creating hyde site in" (:output-dir config))
    (eval-in-project
     project
     `(com.palletops.hyde-pallet.core/build-site
       ~(:output-dir config)
       (merge com.palletops.hyde-pallet.core/jekyll-config
              '~(:jekyll config))
       (merge com.palletops.hyde-pallet.core/site-config
              '~(dissoc config :output-dir :jekyll)))
     `(require 'com.palletops.hyde-pallet.core))))
