;;; Exercise 1.7

(defn sqrt [n]
  (letfn [(good-enough? [old-guess new-guess]
            (< (/ (Math/abs (- old-guess new-guess))
                 old-guess)
              0.001))
          (average [x y] (/ (+ x y) 2))
          (improve [guess]
            (average guess (/ n guess)))
          (help [guess]
            (let [new (improve guess)]
              (if (good-enough? guess new) new
                (help new))))]
    (help 1.0)))


(println "Sqt is : " (sqrt 2))