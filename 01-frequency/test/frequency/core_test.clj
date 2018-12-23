(ns frequency.core-test
  (:require [clojure.test :refer :all]
            [frequency.core :refer :all]))

(deftest example-1
  (testing "test +1, -2, +3, +1 gives 3"
    (is (= (sum-frequency-changes +1, -2, +3, +1) 3))))

(deftest example-2
  (testing "test +1, +1, +1 gives 3"
    (is (= (sum-frequency-changes +1, +1, +1) 3))))

(deftest example-3
  (testing "test +1, +1, -2 gives 0"
    (is (= (sum-frequency-changes 1, +1, -2) 0))))

(deftest example-4
  (testing "test -1, -2, -3 gives -6"
    (is (= (sum-frequency-changes -1, -2, -3) -6))))
