(ns euler-clojure.core-test
  (:require [clojure.test :refer :all]
            [euler-clojure.core :refer :all]))

(deftest euler1-test
  (testing "sum of all the multiples of 3 or 5 below 10"
    (is (= (euler1 1 0) 23))))
