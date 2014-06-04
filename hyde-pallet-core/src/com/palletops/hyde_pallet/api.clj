(ns com.palletops.hyde-pallet.api
  (:require [clojure.string :as string]
            [palletops.hyde :as hyde]
            [com.palletops.hyde-pallet.tags :as tags]
            [com.palletops.docudata.extract :as docudata]
            [clojure.walk :refer [postwalk]]))

(def ^:dynamic *api* {})

(defn clean-api [api-doc]
  (let [ ;; if `d` is a map, replace the value for key `k` with the
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
                    (swapper :doc indent-md-headers)
                    (swapper :methods (constantly "")) ;; todo: why? check maven-crate
                    (swapper :hierarchy (constantly "") ;; it's a var
                             )))]
    (postwalk clean api-doc)))

(defn load-api []
  (clean-api
   ;; TODO: the source paths should come from the project
   {:namespaces (doall (docudata/docudata ["src"] {}))
    :snippets (doall (docudata/snippets-in-path "."))}))


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
     (tags/render-table [["Parameter" "Description"] [["api-doc" "Documentation on this api doc"]]])
     "</div>")))

;; #dd/start test
(defrecord Snippet [snippet])
(defmethod hyde/render Snippet [s]
  (let [snippets (:snippets *api*)
        key (keyword (:snippet s))]
    (:content (get snippets key))))
;; #dd/end

(defn tags []
  {'pallet/api-link #'->Api-Link
   'pallet/api-entry #'->Api-Entry
   'hyde/snippet #'->Snippet})
