(ns sicp.chapter-1.part-3.ex-1-36-test
  (:require [clojure.test :refer [deftest is]]
            [sicp.chapter-1.part-3.ex-1-36 :refer [fixed-point-print]]
            [sicp.misc :as m]))

(def print-logs false)

(deftest fixed-point-print-test
  ; 2.0
  ; 1.5
  ; 1.6666666666666665
  ; 1.6
  ; 1.625
  ; 1.6153846153846154
  ; 1.619047619047619
  ; 1.6176470588235294
  ; 1.6181818181818182
  ; 1.6179775280898876
  ; 1.6180555555555556
  ; 1.6180257510729614
  ; 1.6180371352785146
  ; 1.6180327868852458
  ; Summary: 14 iterations
  (is (= 1.6180327868852458 (fixed-point-print #(+ 1.0 (/ 1 %)) 1 0.00001 print-logs)))

  ; 11.0
  ; 10001.0
  ; 1.000099990001
  ; 1.9999000199960006
  ; 1.5000249962505623
  ; 1.666655557407099
  ; 1.6000039993601023
  ; 1.6249984377538649
  ; 1.6153852070050223
  ; 1.6190473923269566
  ; 1.6176471453147285
  ; 1.6181817851293154
  ; 1.617977540712514
  ; 1.6180555507338048
  ; 1.6180257529146571
  ; 1.6180371345750424
  ; 1.6180327871539473
  ; Summary: 17 iterations
  (is (= 1.6180327871539473 (fixed-point-print #(+ 1.0 (/ 1 %)) 0.0001 0.00001 print-logs)))

  ; 2.9999999999999996
  ; 6.2877098228681545
  ; 3.7570797902002955
  ; 5.218748919675316
  ; 4.1807977460633134
  ; 4.828902657081293
  ; 4.386936895811029
  ; 4.671722808746095
  ; 4.481109436117821
  ; 4.605567315585735
  ; 4.522955348093164
  ; 4.577201597629606
  ; 4.541325786357399
  ; 4.564940905198754
  ; 4.549347961475409
  ; 4.5596228442307565
  ; 4.552843114094703
  ; 4.55731263660315
  ; 4.554364381825887
  ; 4.556308401465587
  ; 4.555026226620339
  ; 4.55587174038325
  ; 4.555314115211184
  ; 4.555681847896976
  ; 4.555439330395129
  ; 4.555599264136406
  ; 4.555493789937456
  ; 4.555563347820309
  ; 4.555517475527901
  ; 4.555547727376273
  ; 4.555527776815261
  ; 4.555540933824255
  ; 4.555536206185039
  ; 4.555532257016376
  ; Summary: 34 iterations
  (is (= 4.555532257016376 (fixed-point-print
                             #(/ (Math/log 1000) (Math/log %))
                             10
                             0.00001
                             print-logs)))

  ; 6.5
  ; 5.095215099176933
  ; 4.668760681281611
  ; 4.57585730576714
  ; 4.559030116711325
  ; 4.55613168520593
  ; 4.555637206157649
  ; 4.55555298754564
  ; 4.555538647701617
  ; 4.555536206185039
  ; Summary: 10 iterations
  (is (= 4.555536206185039 (fixed-point-print
                             #(m/average % (/ (Math/log 1000) (Math/log %)))
                             10
                             0.00001
                             print-logs))))
