(ns fclojure.4clojure30)

(defn samplefn
  [__]
  (and
    (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
    (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
    (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))

(defn testfn
  [__]
  [
   (apply str (__ "Leeeeeerrroyyy"))
   (__ [1 1 2 3 3 2 2 3])
   (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])])

(defn solve30
  [x]
  (map last (partition-by identity x)))

(samplefn solve30)
(testfn solve30)
