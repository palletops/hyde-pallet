(ns com.palletops.hyde-pallet.repl
  (:require [palletops.hyde :as hyde]
            [fipp.edn :refer [pprint]]))

(defrecord Repl [m])
(defmethod hyde/render Repl [m]
  (let [{:keys [pre run] :as r} (:m m)]
    ;;(println (with-out-str (eval `(do ~@pre))))
    (let [out (with-out-str (eval `(do ~@run)))
          outs (map (fn [x]
                      {:single (with-out-str (pprint x))
                       :out (with-out-str (eval `(do ~x)))})
                    run)]
      (apply
       str
       (map (fn [{:keys [single out]}]
              (format "user> %s%s" single out))
            outs)))))

(defn tags []
  {'pallet/repl #'->Repl})
