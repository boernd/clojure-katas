(ns fclojure.core)
  
(defn issue83
  [& bools]
  (some true? bools))

(defn issue61
  [ks vs]
  (into {} (map (fn [k v] [k v]) ks vs)))
  
(defn issue55
  [arg]
  (reduce 
    (fn [result key] (assoc result key (inc (or (get result key) 0)))) 
    {} 
    arg))

(defn issue56
  [arg]
  (reduce
    (fn [coll elem]
      (when (not (some #(= elem %) coll))
        (println elem)
        (conj coll elem)))
    []
    arg))
