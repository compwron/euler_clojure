(ns euler-clojure.core
  (:gen-class))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false)))

(def euler1 (fn [x currentSum] 
	(do
		(println "current x: " x "current sum: " currentSum)
		(if (= 0 (rem x 3))
			(euler1 (- x 1) (+ x currentSum))
			((if (= 0 (rem x 5))
				(euler1 (- x 1) (+ x currentSum)))))
		(if (> x 1)
			(euler1 (- x 1) currentSum))
		(identity currentSum))))


; python
; def result():
; 	current = 0
; 	for i in range(1, 1000):
; 		if i % 3 == 0 or i % 5 == 0:
; 			current += i
; 	return current


; Solutions from projecteuler.net discussion thread, with usernames:

; ; kwatz
; (let ((a (loop for i from 3 to 999 by 3 collect i))
;       (b (loop for i from 5 to 999 by 5 collect i)))
;      (apply #'+ (remove-duplicates (append a b))))

; ; johnbendi 
; (ns euler.problem1)
(defn mult-of-3-or-5? [n]
  (or (= 0 (mod n 3))
      (= 0 (mod n 5))))
(defn euler1 [range-n]
  (reduce + (filter #(mult-of-3-or-5? %)
                    (range range-n))))

; ; dkvasnicka
; (reduce + (distinct (into (range 5 1000 5) (range 3 1000 3))))