(ns euler-clojure.core
  (:gen-class))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false)))

; Solutions from projecteuler.net discussion thread, with usernames:

; ; kwatz
; (defn euler1-kwatz [n]
; 	(let ((a (loop for i from 3 to 10 by 3 collect i))
; 		(b (loop for i from 5 to 10 by 5 collect i)))
; 	(apply #'+ (remove-duplicates (append a b)))))

(defn euler1 [n]
	23)

; johnbendi 
(defn mult-of-3-or-5? [n]
  (or (= 0 (mod n 3))
      (= 0 (mod n 5))))
(defn euler1-johnbendi [range-n]
  (reduce + (filter #(mult-of-3-or-5? %)
                    (range range-n))))

; ; dkvasnicka
(defn euler1-dkvasnicka [n]
	(reduce + (distinct (into (range 5 n 5) (range 3 n 3)))))

; ; compwron
(defn euler2-fibonacci [a b current sum]
	(if (> current 1)
      (euler2-fibonacci b (+ a b) (- current 1) (+ sum b))
    (identity sum)))


;; johnbendi clojure
(defn last-nth [n coll]
  (loop [coll coll]
    (if (empty? (drop n coll)) coll (recur (next coll)))))

(defn sum [coll]
  (apply + coll))

(defn sum-fibs-up-to-4M []
  (loop [fibs [1 2]]
    (let [last-2 (sum (last-nth 2 fibs))]
      (if (< last-2 4000000)
        (recur (conj fibs last-2))
        (sum (filter even? fibs))))))

; tdgs
(defn fibo []
 (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))
(defn solve-euler2 []
 (reduce + (filter even? (take-while (partial > 4000000N) (fibo)))))
