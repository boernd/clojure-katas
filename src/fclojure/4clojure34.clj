(ns fclojure.4clojure34)

(defn samplefn
  [__]
  (and
    (= (__ 1 4) '(1 2 3))
    (= (__ -2 2) '(-2 -1 0 1))
    (= (__ 5 8) '(5 6 7))))

(defn testfn
  [__]
  [
   (__ 1 4)
   (__ -2 2)
   (__ 5 8)])

(defn solve34
  [start end]
  (loop [s start
         i (- end start)
         result []]
        (if (= i 0)
          result
          (recur (inc s) (dec i) (conj result s)))))

; Finding out about iterate...
(defn solve34improved
  [start end]
  (take (- end start) (iterate inc start)))

(samplefn solve34)
(testfn solve34)

(samplefn solve34improved)
(testfn solve34improved)
