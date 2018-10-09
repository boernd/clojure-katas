(ns fclojure.4clojure29)

(defn samplefn
  [__]
  (and
    (= (__ "HeLlO, WoRlD!") "HLOWRD")
    (empty? (__ "nothing"))
    (= (__ "$#A(*&987Zf") "AZ")))

(defn testfn
  [__]
  [
    (= (__ "HeLlO, WoRlD!") "HLOWRD")
    (empty? (__ "nothing"))
    (= (__ "$#A(*&987Zf") "AZ")])

(defn solve29
  [string]
  (clojure.string/join (re-seq #"[A-Z]+" string)))

(testfn solve29)

(samplefn solve29)
