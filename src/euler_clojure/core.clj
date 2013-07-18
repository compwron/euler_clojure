(ns euler-clojure.core
  (:gen-class))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false)))

(declare euler1-recur)
(def euler1 (fn [x] 
	(do
		(println "current x: " x)
		(if (> 0 x)
			x
			(euler1-recur (- x 1))))))

(def euler1-recur (fn [x] 
	(do
		(println "current x in recur: " x)
		(if (> 0 x)
			x
			(euler1 (- x 1))))))

; (declare div2-recur)
; (defn sqrt-recur [n]
;   (do
;     (println "sqrt-recur:" n)
;     (if (< n 1)
;       n
;       (div2-recur (Math/sqrt n)))))
 
; (defn div2-recur [n]
;   (do
;     (println "div2-recur:" n)
;     (if (< n 1)
;       n
;       (sqrt-recur (/ n 2)))))


; python
; def result():
; 	current = 0
; 	for i in range(1, 1000):
; 		if i % 3 == 0 or i % 5 == 0:
; 			current += i
; 	return current