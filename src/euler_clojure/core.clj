(ns euler-clojure.core
  (:gen-class))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false)))

(def euler1 (fn [x currentSum] 
	(do
		(println "current x: " x "current sum: " currentSum)
		(if (= 0 (/ x 3))
			(println "divisible by 3")
			(if (= 0 / x 5)
				(println "divisible by 5")
				(euler1 (- x 1) (+ x currentSum)) ))
		(if (> x 1)
			(euler1 (- x 1) currentSum)
			(identity currentSum)))))





; python
; def result():
; 	current = 0
; 	for i in range(1, 1000):
; 		if i % 3 == 0 or i % 5 == 0:
; 			current += i
; 	return current