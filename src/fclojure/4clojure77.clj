(ns fclojure.4clojure77)

(defn 4cl77
  [strvec]
  (let [myvec (map #(vec (char-array %1) strvec))]))
    
