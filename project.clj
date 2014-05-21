(defproject com.palletops/hyde-pallet "0.1.0-SNAPSHOT"
  :description "Parent for hyde-pallet"
  :url "https://github.com/paleltops/hyde-pallet"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.palletops/hyde-pallet "0.1.0-SNAPSHOT"]]
  :plugins [[lein-modules "0.3.1"]]
  :aliases {"install" ["modules" "install"]
            "deploy" ["modules" "deploy"]
            "clean" ["modules" "clean"]})
