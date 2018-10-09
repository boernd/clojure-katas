(ns fclojure.4clojure38)

(defn samplefn
  [__]
  (and
   (= (__ 1 8 3 4) 8)
   (= (__ 30 20) 30)
   (= (__ 45 67 11) 67)))

(defn testfn
  [__]
  [
   (= (__ 1 8 3 4) 8)
   (= (__ 30 20) 30)
   (= (__ 45 67 11) 67)])

(defn solve38
  [& nums]
  (reduce #(if (> %1 %2) %1 %2) nums))

(samplefn solve38)
