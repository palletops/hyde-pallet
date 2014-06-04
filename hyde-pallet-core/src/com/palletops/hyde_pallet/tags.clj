(ns com.palletops.hyde-pallet.tags
  (:require [palletops.hyde :as hyde]))


(defrecord Project [project])
(defmethod hyde/render Project [p]
  (format "[%s](http://github.com/pallet/%s)" (:project p) (:project p)))

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


(def tags
  {'pallet/project #'->Project
   'pallet/table #'->Table})
