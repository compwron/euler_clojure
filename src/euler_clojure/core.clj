(ns euler-clojure.core
  (:gen-class))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false)))

(def euler1 (fn [x] (* x x)))