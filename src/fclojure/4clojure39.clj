(ns fclojure.4clojure39)

(defn samplefn
  [__]
  (and
    (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
    (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
    (= (__ [1 2 3 4] [5]) [1 5])
    (= (__ [30 20] [25 15]) [30 25 20 15])))

(defn testfn
  [__]
  [
    (__ [1 2 3] [:a :b :c])
    (__ [1 2] [3 4 5 6])
    (__ [1 2 3 4] [5])
    (__ [30 20] [25 15])])

(defn solve39
  [a b]
  (flatten (map #(vector %1 %2) a b)))

(samplefn solve39)
(testfn solve39)
