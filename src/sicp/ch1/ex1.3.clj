;;; Exercise 1.3

(defn sum-square-larger [a b c]
  (letfn [(square [n] (* n n))]
    (- (apply + (map square (vector a b c)))
      (square (min a b c)))))
