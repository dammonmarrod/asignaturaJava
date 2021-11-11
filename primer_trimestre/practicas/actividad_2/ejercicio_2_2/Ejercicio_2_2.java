/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarborrar;

import java.util.Scanner;

public class Ejemplos {

	/* Declaro un Scanner para leer desde teclado */
	public static Scanner sc = new Scanner(System.in);

	/* Declaro un array tipo String  5X3*/
	public static String[][] arrayPeliculas = { 		
                        { "E.T ", "Sharknado ", " Godzilla " },//primera fila
                        { "8    ","3           ","9         "},//segunda fila
                        { "5    ","8           ","7         "},//tercera fila
                        { "10   ","9           ","6         "},//cuarta fila
                        { "4    ","7           ","8         " },//quinta fila
			};
			

	public static String stringIntroducido; /* Variable para recoger el valor introducido por el usuario */
	public static int esNumeroEntero;
	public static int opcionSeleccionada; /* variable para mostrar que el valor introducido es un número */
        public static double numeroDouble; /*Variable para obtener valores doubles dentro de los métodos*/
	public static int numeroEntero; /*Variable para obtener valores enteros dentro de los métodos*/
	
	public static void main(String[] args) {
                
               
                numeroEntero=pideEntero();
                System.out.println(numeroEntero);
                numeroDouble=pideDouble("Introduce un valor double: ");
                System.out.println(numeroDouble);
                numeroDouble=pideDoubleEntre(2.5,2.6);
                System.out.println(numeroDouble);
                numeroEntero=pideEnteroEntre(0,4);
                System.out.println(numeroEntero);
                mostrarInfoPeliculas(arrayPeliculas);
                modificaNombrePelicula(arrayPeliculas);
                modificaPuntuacionPelicula (arrayPeliculas);
                mostrarPuntuacionesPelicula(arrayPeliculas);
               
                
                
		/* Con un do-while mostramos el menú hasta que se introduzca un 0 */
		do {
			/* Mostramos el menú */
			System.out.println("=========================================");
			System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:");
			System.out.println("1. Mostrar el nombre y puntuaciones de todas las películas.");
			System.out.println("2. Modificar el nombre de una película según su posición en el array. ");
			System.out.println("3. Modificar una puntuación de una película según su posición en el array.");
			System.out.println("4. Mostrar las puntuaciones de una película en concreto seleccionada según su posición en el array.");
			System.out.println("0 Finalizar.");

			opcionSeleccionada = pideEntero();/* Guardo el número introducido en una variable de tipo int*/

			/*Si es menor que 0 y mayor que 4 que son las opciones posibles, muestro el mensaje de error*/
			if(opcionSeleccionada <0 && opcionSeleccionada > 4) {
				System.out.println("Valor introducido no válido");
			}
			
			switch (opcionSeleccionada) {

			case 1:
				/*Mostrar el nombre y puntuaciones de todas las películas*/
				//mostrarArray(arrayPelicula);
				break;

			case 2:
                                //Modificar el nombre de la pelicula segun su posición en el array
				break;

			case 3:
				/*Modificar una puntuación de una película 
				 * según su posición en el array */
				//modificaPuntuacionPelicula(arrayPelicula);
				break;

			case 4:
				/*Mostrar las puntuaciones de una película en concreto seleccionada 
				 * según su posición en el array.*/
				//mostrarPuntuacionesPelicula(arrayPelicula);
				break;
			}

			/*
			 * Si el usuario introduce un 0, se ha de mostrar un mensaje de despedida y
			 * finalizar el programa
			 */
		} while (opcionSeleccionada != 0);

	}

	

	
	/*
	 * pideEntero() que no reciba ningún parámetro y retorne un valor entero. La
	 * función ha de pedir un número por consola (si el usuario no introduce un
	 * número se ha de volver a pedirlo repitiendo el proceso hasta que el usuario
	 * introduzca un valor numérico válido) y retornar el número introducido.
	 */
	public static int pideEntero() {
		boolean esNumero = false;
		do {
			System.out.println("Introduce un número entero: ");
			stringIntroducido = sc.nextLine();
                        //Usamos la función creada isNum para evaluar el valor introducido
			if (isNum(stringIntroducido)) {
				esNumero = true; // Si es número dejamos de pedir el valor
			}else {
				System.out.println("El valor introducido no es un número entero. Introduce por favor un número válido.");
			}
		} while (esNumero != true);

		return Integer.parseInt(stringIntroducido);//parseamos el String para retornar un int
	}

        
	/* Función para verificar que es un número el valor introducido
        Recibe un String y luego evaluar si es número, devolviendo un booleano*/
        /*isNum no existe en java, por lo que lo que se hace es intentar parsear el dato introducido
         Si no se puede parsear es que no es un int.*/
        
	public static boolean isNum(String strNum) {
		boolean respuesta = true;
		try {
			Integer.parseInt(strNum);// Si es posible parsearlo el String es un número
		} catch (NumberFormatException e) {
			respuesta = false;
		}
		return respuesta;
	}

       
       /*pideDouble(String pregunta) que reciba una String 
        y retorne un valor double. 
        La función ha de mostrar por consola el valor del parámetro (la string)
        y pedir un número por consola (si el usuario no introduce un 
        se ha de volver a pedirlo repitiendo el proceso hasta 
        que el usuario introduzca un valor numérico válido) y retornar el número introducido. */
        
        public static double pideDouble(String pregunta) {
            boolean esDouble = false;
            do {
                System.out.println(pregunta);
                stringIntroducido = sc.nextLine();
                //Usamos la función creada isNumDouble para evaluar el valor introducido
                    if (isNumDouble(stringIntroducido)) {
				esDouble = true; // Si es un numero Double dejamos de pedir el valor
			}else {
				System.out.println("El valor introducido no es un double. Introduce por favor una opción válida.");
			}
		} while (esDouble != true);
            return Double.parseDouble(stringIntroducido);
        }
        
        /* Función para verificar que es un double el valor introducido
        Recibe un String y luego evalua si es un double, devolviendo un booleano*/
	public static boolean isNumDouble(String strNum) {
		boolean respuesta = true;
		try {
			Double.parseDouble(strNum);// Si es posible parsearlo; por lo que el String es un double
		} catch (NumberFormatException e) {
			respuesta = false;
		}
		return respuesta;
	}  
        
        /*pideDoubleEntre(double valor1, double valor2): 
        pide un valor double situado entre dos valores. 
        Si no se indica un valor correcto se vuelve a pedir. 
        Retorna el valor double indicado por el usuario.*/
        
        public static double pideDoubleEntre(double valor1, double valor2){
            boolean contieneDouble = false;
            do {
                //Pido un valor que sea double
                numeroDouble=pideDouble("Introduce un valor double comprendido entre:  " + valor1 + " y " + valor2);
                //cuando obtenga un double valido, lo evaluó
                    if ((numeroDouble>valor1) && (numeroDouble < valor2)) {//Solo si es mayor que valor1 y menor que valor2 estará comprendido
				contieneDouble = true; // Si es un numero que esta contenido dejamos de pedir el valor
			}else {
				System.out.println("El valor introducido no es un double valido. Introduce un valor entero comprendido entre:  " + valor1 + " y " + valor2 );
			}
		} while (contieneDouble != true);
            return numeroDouble;
            
        }
        
        /*pideEnteroEntre(int valor1, int valor2) :
        pide un valor entero situado entre dos valores. 
        Si no se indica un valor correcto se vuelve a pedir. 
        Retorna el valor int indicado por el usuario.*/    
        
          public static int pideEnteroEntre(int valor1, int valor2){
            boolean contieneInt = false;
            do {
                //Pido un valor que sea entero
                System.out.println("Introduce un valor entero comprendido entre:  " + valor1 + " y " + valor2);
                stringIntroducido = sc.nextLine();
                       //Usamos la función creada isNum para evaluar que el valor introducido sea un entero
			if (isNum(stringIntroducido)) {
                                //cuando obtenga un int valido, lo parseo y lo evaluó
                                numeroEntero= Integer.parseInt(stringIntroducido);
                                if ((numeroEntero>valor1) && (numeroEntero < valor2)) {//Solo si es mayor que valor1 y menor que valor2 estará comprendido
				contieneInt = true; // Si es un numero que esta contenido dejamos de pedir el valor
                                }else {
                                        System.out.println("El valor introducido no es un entero valido. Introduce un valor entero comprendido entre:  " + valor1 + " y " + valor2 );
                                }
			}else {
				System.out.println("El valor introducido no es un número entero. Introduce por favor una valor válido.");
			}               
		} while (contieneInt != true);
            return numeroEntero;
            
        }
          
          
        /*mostrarInfoPeliculas (String[][] puntuaciones) : 
          recibe el array de puntuaciones y lo muestra.*/
        public static void mostrarInfoPeliculas(String[][] puntuaciones) {
		System.out.println("===============================================");
		System.out.println("Array de películas y sus puntuaciones:");
		
		for (int i = 0; i < puntuaciones.length; i++) {// puntuaciones.length nos proporciona el número de filas (5),
			for (int j = 0; j < puntuaciones[i].length; j++) {//puntuaciones[i].length, nos proporciona el número de elementos en cada fila.
			   System.out.print(puntuaciones[i][j] + " ");
			}
			System.out.println();
		}
                System.out.println();
	}
        
        /*modificaNombrePelicula (String[][] puntuaciones) : 
        modifica el nombre de una película según su posición en el array.*/
        public static void modificaNombrePelicula(String[][] puntuaciones) {
            int posicion_i;
            int posicion_j;
            boolean salir=false;
            System.out.println("===============================================");
            
            do{
                //Pido un valor que sea entero
                    System.out.println("Introduce la posición \"i \" de la película que deseas modificar:");
                    posicion_i=pideEnteroEntre(-1,1);//Los nombres de peliculas solo estan en la posición i =0, así que es el único valor válido que acepta.
                    System.out.println("Introduce la posición \"j \" de la película que deseas modificar:");
                    posicion_j=pideEnteroEntre(-1,3);//Solo puedo modificar 3 posiciones de la 0 a la 2
                    System.out.println("El nombre de la película que quieres modificar es: " + puntuaciones[posicion_i] [posicion_j]+ ". Escribe SI, si es correcto." );
                    stringIntroducido= sc.nextLine();
                    if(stringIntroducido.equalsIgnoreCase("si")){
                         String nombreAnterior=puntuaciones[posicion_i][posicion_j];//guardo el nombre que voy a borrar
                         System.out.println("¿Cuál es el nombre nuevo de la película?:");
                         stringIntroducido= sc.nextLine();
                         puntuaciones[posicion_i][posicion_j]=stringIntroducido;//guardo el nombre de la nueva pelicula
                         System.out.println("Se ha cambiado el nombre de la pelicula :" + nombreAnterior + " por la película: " + stringIntroducido );
                         mostrarInfoPeliculas(puntuaciones);
                         salir=true;
                    }          
            }while(salir!=true);                     
           System.out.println();
	}
       
        /*modificaPuntuacionPelicula (String[][] puntuaciones) : 
        modifica una puntuación de una película según su posición en el array.
        */
         public static void modificaPuntuacionPelicula(String[][] puntuaciones) {
            int posicion_i;
            int posicion_j;
            boolean salir=false;
            boolean contieneInt = false;
            System.out.println("===============================================");
            
            do{
                //Pido un valor que sea entero
                    System.out.println("Introduce la posición \"i \" de la puntuación que deseas modificar:");
                    /*Los valores de las puntuaciones de peliculas estan 
                    entre la fila 1 y la fila 5 que se corresponden con la posicón i=1 y i=4, así que son los únicos valor válidos que se acepta.*/
                    posicion_i=pideEnteroEntre(0,5);
                    System.out.println("Introduce la posición \"j \" de la película que deseas modificar:");
                    /*Los valores de las puntuaciones de peliculas estan 
                    entre la columna 1 y 3 que se corresponden con la posicón i=0 y i=2, así que son los únicos valor válidos que se acepta.*/
                    posicion_j=pideEnteroEntre(-1,3);
                    System.out.println("El valor de la puntuación de la película que quieres modificar es: " + puntuaciones[posicion_i] [posicion_j]+ ". Escribe SI, si es correcto." );
                    stringIntroducido= sc.nextLine();
                    if(stringIntroducido.equalsIgnoreCase("si"))
                         do{
                             String puntuacionAnterior=puntuaciones[posicion_i][posicion_j];//guardo el valor que voy a borrar
                             System.out.println("¿Cuál es el valor nuevo de la puntuación de la película?:");
                            stringIntroducido= sc.nextLine();
                            //Verificamos que es un número
                               if (isNum(stringIntroducido)) {
                                      //cuando obtenga un int valido, lo guardo en la posicion
                                      puntuaciones[posicion_i][posicion_j]=stringIntroducido+"           " ;//guardo el nombre de la nueva puntuación
                                      System.out.println("Se ha cambiado el valor de la puntuación de la pelicula :" + puntuacionAnterior + " por el valor: " + stringIntroducido );
                                      mostrarInfoPeliculas(puntuaciones);
                                      salir=true;
                                      contieneInt=true;
                              }else {
                                      System.out.println("El valor introducido no es un número entero. Introduce por favor una valor válido.");
                             }   
                         }while(contieneInt !=true);    
            }while(salir!=true);    
            
           System.out.println();
	}
         
        
        /*mostrarPuntuacionesPelicula (String[][] puntuaciones) :
         muestra las puntuaciones de una película en concreto seleccionada según su posición en el array.
         */ 
          public static void mostrarPuntuacionesPelicula(String[][] puntuaciones) {
            int posicion_i;
            int posicion_j;
            boolean salir=false;
            System.out.println("===============================================");
            
            do{
                //Pido un valor que sea entero
                    System.out.println("Introduce la posición \"i \" de la película cuyos valores deseas mostrar:");
                    posicion_i=pideEnteroEntre(-1,1);//Los nombres de peliculas solo estan en la posición i =0, así que es el único valor válido que acepta.
                    System.out.println("Introduce la posición \"j \" de la película cuyos valores deseas mostrar:");
                    posicion_j=pideEnteroEntre(-1,3);//Solo hay 3 columnas, que corresponden con las posiciones de la 0 a la 2
                    System.out.println("El nombre de la película cuyas puntuaciones quieres mostrar son: " + puntuaciones[posicion_i] [posicion_j]+ ". Escribe SI, si es correcto." );
                    stringIntroducido= sc.nextLine();
                    if(stringIntroducido.equalsIgnoreCase("si")){
                        System.out.print("Las puntuaciones de la pelicula " + puntuaciones[posicion_i] [posicion_j] +" son: ");
                        //El valor de la columna es decir j será el mismo siempre
                        //i empieza en 1 porque la posición 0 corresponde al nombre de la película
                        for (int i = 1; i < puntuaciones.length; i++) {//puntuaciones[i].length, nos proporciona el número de elementos en cada fila.
                            System.out.print(puntuaciones[i][posicion_j]);
			}
			System.out.println();
                        salir=true;
                    }          
            }while(salir!=true);                     
           System.out.println();
           sc.close();
	}
         
}
