(ns sicp.chapter-1.part_2.ex-1-14
  (:require [sicp.chapter-1.part-2.book-1-2 :as b]))

; Exercise 1.14
; Draw the tree illustrating the process generated by the count-change procedure of 1.2.2 in making change for 11 cents.
; What are the orders of growth of the space and number of steps used by this process as the amount to be changed increases?

(defn change
  [amount type-of-coins]
  (cond (= amount 0) 1
        (or (< amount 0) (= type-of-coins 0)) 0
        :else (+ (change amount (- type-of-coins 1))
                 (change (- amount (b/first-denomination type-of-coins)) type-of-coins))))

(defn money-change [amount]
  (change amount 5))
