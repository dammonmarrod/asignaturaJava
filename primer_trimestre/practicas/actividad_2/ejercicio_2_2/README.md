
1.	Ejercicio02.java: escribe un programa que almacene en un array bidimensional (tipo String) el nombre de tres películas y sus cuatro puntuaciones con los valores mostrados en el esquema mostrado después del enunciado. Seguidamente se mostrará por consola todos los valores almacenados en el array y seguidamente se pedirá al usuario si quiere:
1-Mostrar el nombre y puntuaciones de todas las películas.
2-Modificar el nombre de una película según su posición en el array
3-Modificar una puntuación de una película según su posición en el array
4-Mostrar las puntuaciones de una película en concreto seleccionada según su posición en el array.
0-Salir
El usuario escogerá la película según el que ocupe dentro del array.
El programa no ha de finalizar hasta que el usuario seleccione la opción 0.
Se debe controlar que sean posiciones correctas.
Para realizar el ejercicio debes definir y utilizar correctamente siempre que sea posible las siguientes funciones:
a.	pideEntero() que no reciba ningún parámetro y retorne un valor entero. La función ha de pedir un número por consola (si el usuario no introduce un número se ha de volver a pedirlo repitiendo el proceso hasta que el usuario introduzca un valor numérico válido) y retornar el número introducido.
b.	 pideDouble(String pregunta) que reciba una String  y retorne un valor double. La función ha de mostrar por consola el valor del parámetro (la string) y pedir un número por consola (si el usuario no introduce un número se ha de volver a pedirlo repitiendo el proceso hasta que el usuario introduzca un valor numérico válido) y retornar el número introducido.
c.	pideDoubleEntre(double valor1, double valor2) : pide un valor double situado entre dos valores. Si no se indica un valor correcto se vuelve a pedir. Retorna el valor double indicado por el usuario.
d.	pideEnteroEntre(int valor1, int valor2) : pide un valor entero situado entre dos valores. Si no se indica un valor correcto se vuelve a pedir. Retorna el valor int indicado por el usuario.
e.	mostrarInfoPeliculas (String[][] puntuaciones) : recibe el array de puntuaciones y lo muestra.
f.	modificaNombrePelicula (String[][] puntuaciones) : modifica el nombre de una película según su posición en el array.
g.	modificaPuntuacionPelicula (String[][] puntuaciones) : modifica una puntuación de una película según su posición en el array.
h.	mostrarPuntuacionesPelicula (String[][] puntuaciones) : muestra las puntuaciones de una película en concreto seleccionada según su posición en el array.



EJEMPLO ESTRUCTURA DEL ARRAY BIDIMENSIONAL DE STRINGS
“E.T.”
“8”
“5”
“10”
“4”
	“Sharknado”
“3”
“8”
“9”
“7”
	“Godzilla”
“9”
“7”
“6”
“8”
	

