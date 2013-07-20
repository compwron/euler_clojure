(ns euler-clojure.core-test
  (:require [clojure.test :refer :all]
            [euler-clojure.core :refer :all]))

; (deftest euler1-kwatz-test
;   (testing "sum of all the multiples of 3 or 5 below 10"
;     (is (= (euler1-kwatz 10) 23))))
(deftest euler1-johnbendi-test
  (testing "sum of all the multiples of 3 or 5 below 10"
    (is (= (euler1-johnbendi 10) 23))))
(deftest euler1-dkvasnicka-test
  (testing "sum of all the multiples of 3 or 5 below 10"
    (is (= (euler1-dkvasnicka 10) 23))))

(deftest euler2-fibonacci-test
  (testing "sum of fibonacci sequence up to x numbers"
  	; 1 1 2 3  ;5 8
    (is (= (euler2-fibonacci 1 1 4 1) 7))))

; TODO: fizzbuzz
; TODO: fibonacci 