
1.	Ejercicio01.java: escribe un programa que pida al usuario 5 valores decimales del 0 al 100. Se deben almacenar en un array y mostrarlos por consola.  Si el usuario introduce un valor incorrecto, se ha de volver a pedir.
Mediante un SWITCH, el programa debe mostrar el siguiente mensaje al usuario:

Introduzca la operación a realizar del siguiente menú de opciones: 
1-	Modificar el valor almacenado en una posición. 
2-	Mostrar el resultado de sumar todos los números 
3-	Mostrar el número más alto y más bajo. 
4-	Ordena el array situando primero todos los números pares y luego los impares
0-Finalizar


Para realizar el ejercicio debes definir y utilizar correctamente siempre que sea posible las siguientes funciones:
a.	pideEntero() que no reciba ningún parámetro y retorne un valor entero. La función ha de pedir un número por consola (si el usuario no introduce un número se ha de volver a pedirlo repitiendo el proceso hasta que el usuario introduzca un valor numérico válido) y retornar el número introducido.
b.	 pideDouble(String pregunta) que reciba una String  y retorne un valor double. La función ha de mostrar por consola el valor del parámetro (la string) y pedir un número por consola (si el usuario no introduce un número se ha de volver a pedirlo repitiendo el proceso hasta que el usuario introduzca un valor numérico válido) y retornar el número introducido.
c.	pideDoubleEntre(double valor1, double valor2) : pide un valor double situado entre dos valores. Si no se indica un valor correcto se vuelve a pedir. Retorna el valor double indicado por el usuario.
d.	pideEnteroEntre(int valor1, int valor2) : pide un valor entero situado entre dos valores. Si no se indica un valor correcto se vuelve a pedir. Retorna el valor int indicado por el usuario.
e.	OK mostrarArray(double[] valores) : recibe el array de valores y lo muestra.OK
f.	OK ordenarParesImpares(double[] valores) : Ordena y retorna el array situando primero todos los números pares y luego los impares
g.	OK menorYmayor(double[] valores) : muestra el número más  alto y el más bajo almacenados en el array.
h.	OK sumarValores(double[] valores) : Sumar todos los números almacenados en el array y mostrar el resultado.
i.	OK modificarUnValor(double[] valores) : en este caso se pedirá qué posición del array se quiere modificar y su nuevo valor numérico entre 0 y 100 para situarlo en la posición indicada A continuación se deben mostrar todos los valores almacenados en el array.

Cada vez que se realice la operación 1, 2, 3 y 4 se ha de mostrar por pantalla los valores almacenados en el array. Controla mediante un DO WHILE que una vez realizada la operación seleccionada se vuelva a mostrar el menú de operaciones excepto si el usuario ha introducido un 0. Si se introduce un valor menor a 0, indica que se ha introducido un valor incorrecto y vuelve a mostrar el menú.
