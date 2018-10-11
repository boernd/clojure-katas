(ns fclojure.4clojure28)

(defn samplefn
  [__]
  (and
    (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
    (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
    (= (__ '((((:a))))) '(:a))))

(defn testfn
  [__]
  [
    (__ '((1 2) 3 [4 [5 6]]))
    (__ ["a" ["b"] "c"])
    (__ '((((:a)))))])

(defn solve28
  [s]
  (reduce
    (fn flatit [col elem]
      (println elem)
      (if (sequential? elem)
        (reduce flatit col elem)
        (conj col elem))) [] s))

(samplefn solve28)
(testfn solve28)
