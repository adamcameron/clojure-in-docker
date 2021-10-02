(ns clojure-in-docker.greeting-test
  (:require [clojure.test :refer :all]
            [clojure-in-docker.greeting :refer :all]))

(deftest test-greet-default-behaviour
  (testing "it should return G'day world if no name is passed"
    (is (= "G'day World" (greet [])))))

(deftest test-greet-by-single-name
  (testing "it should return G'day [name] if just that name is passed"
    (is (= "G'day Zachary" (greet ["Zachary"])))))

(deftest test-greet-by-multiple-name
  (testing "it should return G'day [name] if more than one names are passed"
    (is (= "G'day Zachary" (greet ["Zachary" "Cameron" "Lynch"])))))
