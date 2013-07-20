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


(defn euler2-fibonacci [a b current]
  (println "a: " a " b: " b " current: " current)
	(if (= current 0)
      (euler2-fibonacci b (+ a b) (- current 1))
    (identity b)))
