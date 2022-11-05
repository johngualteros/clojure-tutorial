(
 defn sum [number1 number2]
   (println (+ number1 number2))
)

(sum 15 7)

(print (= 1 2)) ;return false

(print(class "a")) ; return java.lang.String "Clojure run in the jvm (Java Virtual Machine)"
(print(class [1 2 3]))

(def x 1)

(print x)

(def listNumbers [1 2 3])

(println listNumbers)

;map
(println (map * [1 2 3] [4 5 6]))
(println (map (partial * 2) [2 3 4]))

;currification
(println (* 1 2))

(def mul (partial * 100))
(print (mul 2))


(
 defn p [x y z]
   (print (str x" "y" "z))
)

(def p2(partial p "Hi" "Awesome"))
(p2 "Developer")

;Validate if is palindrome

(
 defn validateIfIsPalindrome [text]
   ( = (str text) (apply str(reverse(str text))))
)

(print(validateIfIsPalindrome "ana")) ; return true
(print(validateIfIsPalindrome "Hello world")) ; return false

