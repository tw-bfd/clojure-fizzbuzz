(defn fizzbuzz [n]
(cond 
(and (= (mod n 3) 0) (= (mod n 5) 0)) "fizzbuzz"
(= (mod n 3) 0) "fizz"
(= (mod n 5) 0)  "buzz"
:else n
)
)

(defn solution
[]
(doseq [x (vec (range 1 101))] (prn (fizzbuzz x)))
)

