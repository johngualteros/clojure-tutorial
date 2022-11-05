# Clojure basics / Clojure basicos
***
## English
#### Define variables in clojure

```clojure
(def variable 2)
```

### comments
```clojure
;This is a clojure comment
```

### to print
```clojure
(print (variable))
;o on a new line
(println (variable))
```

### define functions
#### parameters are defined inside []
#### to do operations the operator goes first an example

```clojure
(
 defn sum [number1 number2]
   (println (+ number1 number2))
)

;we call the function
(sum 15 7)
```

### know the data type
```clojure
(print(class "a")) ; returns java.lang.String "Clojure runs through the jvm (Java Virtual Machine)"
```

### map method
```clojure
(println (map (partial * 2) [2 3 4]))
```
#### in the previous example what happens is that in the partial we will reserve that space where it will be replaced by our array and multiply each element of the array by 2


### check if it is a palindrome with clojure

```clojure
(
 defn validateIfIsPalindrome [text]
   ( = (str text) (apply str(reverse(str text))))
)

(print(validateIfIsPalindrome "ana")) ; return true
(print(validateIfIsPalindrome "Hello world")) ; return false
```

#### we declare a function that receives a text as a parameter the expression = is an if in clojure where we validate if the text parsed to string is equal to the application of string backwards the apply str is used since the reverse method returns a sequence that is to say that it would return something similar to this

> \\a \\n \\a

#### that's why we use it I'll try to make it a little more understandable in python but with clojure methods it won't work in python but it will be understood a little more

```python
def validateIfIsPalindrome(text):
    if str(text) == (apply str(reverse(str(text)))):
        return true
    return false
```


## Español

#### Definir variables en clojure

```clojure
(def variable 2)
```

### comentarios
```clojure
;Esto es un comentario clojure
```

### imprimir
```clojure
(print (variable))
;o en una nueva linea
(println (variable))
```

### definir funciones
#### los parametros se definen dentro de []
#### para hacer operaciones va primeor el operador un ejemplo

```clojure
(
 defn sum [number1 number2]
   (println (+ number1 number2))
)

;invocamos la función
(sum 15 7)
```

### saber el tipo de dato
```clojure
(print(class "a")) ; retorna java.lang.String "Clojure corre a traves de la jvm (Maquina Virtual de Java)"
```

### metodo map
```clojure
(println (map (partial * 2) [2 3 4]))
```
#### en el ejemplo anterior lo que pasa es que en el partial reservaremos ese espacio donde se sustituira por nuestro arreglo y multiplicara por 2 cada elemento del arreglo


### validar si es un palindromo con clojure

```clojure
(
 defn validateIfIsPalindrome [text]
   ( = (str text) (apply str(reverse(str text))))
)

(print(validateIfIsPalindrome "ana")) ; return true
(print(validateIfIsPalindrome "Hello world")) ; return false
```

#### declaramos una función que recibe como parametro un texto la expresión = es un if en clojure donde validamos si el texto parseado a string es igual a la aplicación de string al revez el apply str se usa ya que el metodo reverse devuelve una secuencia es decir que devolveria algo parecido a esto

> \\a \\n \\a

#### es por eso que lo usamos intentare hacerlo un poco mas entendible en python pero con los metodos de clojure no funcionará en python pero se entenderá un poco más

```python
def validateIfIsPalindrome(text):
    if str(text) == (apply str(reverse(str(text)))):
        return true
    return false
```