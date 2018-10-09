(ns fclojure.4clojure73)

(defn samplefn [__]
  [
   (__ [[:x :e :o]
        [:x :e :e]
        [:x :e :o]])])

; options

; 1) test all 8 win possibilities

; 2) for loop checking all win possibilities that this field can be part of

(def win-positions
  [[[0 0] [0 1] [0 2]]
   [[1 0] [1 1] [1 2]]
   [[2 0] [2 1] [2 2]]
   [[0 0] [1 0] [2 0]]
   [[0 1] [1 1] [2 1]]
   [[0 2] [1 2] [2 2]]
   [[0 0] [1 1] [2 2]]
   [[2 2] [1 1] [0 0]]])

(defn game-running [board]
  (for [row win-positions]
    (map #(get-in board %) row)))

;(samplefn game-running)

(def board
  [[:x :e :o]
   [:x :e :e]
   [:x :e :o]])

(def board2
  [[:e :e :e]
   [:e :e :e]
   [:e :e :e]])

(def board3
  [[:x :e :e]
   [:x :o :e]
   [:o :e :x]])

(def board4
  [[:e :e :e]
   [:x :x :x]
   [:o :e :x]])

(defn tic-tac-toe [board]
  (let [[[a b c][d e f][g h i]] board 
        value  (cond 
                 (= a b c) a
                 (= d e f) d
                 (= g h i) g
                 (= a d g) a
                 (= b e h) b
                 (= c f i) c
                 (= a e i) a
                 (= g e c) g
                 :else :e)]
    (if (= :e value) nil value)))
