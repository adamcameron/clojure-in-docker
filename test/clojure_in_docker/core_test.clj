(ns clojure-in-docker.core-test
  (:require [clojure.test :refer :all]
            [clojure-in-docker.core :refer :all]))

(deftest a-test
  (testing "test runner"
    (is (= 1 1))))
