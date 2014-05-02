(ns indentparse.core-test
  (:require [clojure.test :refer :all]
            [indentparse.core :refer :all]))

(deftest parse-test
  (testing "parse test"
    (is (= (parse
"a
  b
  c
d
  e
  f")
           ["a" ["b" "c"] "d" ["e" "f"]]))))
