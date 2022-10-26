# Taller-Solid
Literal 1: Debido a que las 2 clases tienen atributos y procedimientos similares.
Se añadió una clase padre debido a la semejanza de atributos y métodos, además están heredan de ella. Para cumplirse el principio de Liskow y la de Open/Close.

Literal 2: En el punto #2 menciona que hay dos métodos en una clase llamada OperacionesAderezo que pueden ser agregados en la clase Postre para que las clases que heredan puedan hacer uso de estos métodos de agregar y eliminar aderezo, esto se debe a que se incumplió la Dependency Inversion Principle al hacer uso de algunos métodos de una clase no abstracta para modificar los valores de las clases de Pastel y Helado.

Literal 3: Está rompiendo el primer principio Simple responsibility ya que esta utilizando el mismo método reiteradas ocasiones en vez de hacerlo general para todos sus productos además se simplifico el código realizando una multiplicación por 1.12. 

Literal 4: Está incumpliendo el principio de open close ya que no permite que cresca el programa y como estaba abstracta hace que este excepta a modificaciones(solo extension). Al momento de cambiar los enum por las clases se cumplio este principio.

Literal 5: Principio de substitución de Liskov porque habia un RuntimeExcepction ya que al no poder usar en los tipos de pasteles ese tipo de leche lanzaba ese error y lo que se hizo fue cambiarle con un Print de que ese tipo de leche no se podia usar para ese tipo de postre.
