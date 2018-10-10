(ns fclojure.4clojure26)

(defn samplefn
  [__]
  (and
    (= (__ 3) '(1 1 2))
    (= (__ 6) '(1 1 2 3 5 8))
    (= (__ 8) '(1 1 2 3 5 8 13 21))))

(defn testfn
  [__]
  [
    (= (__ 3) '(1 1 2))
    (= (__ 6) '(1 1 2 3 5 8))
    (= (__ 8) '(1 1 2 3 5 8 13 21))])

(defn solve26
  [len]
  (loop [x len
         f 0
         s 1
         result []]
    (if (= x 0)
      result
      (recur (dec x) s (+ f s) (conj result s)))))

(samplefn solve26)
(testfn solve26)
