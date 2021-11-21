
package actividad02_0485;

import java.util.Scanner;

public class Ejercicio01 {

	/*Declaro un Scanner para leer desde teclado*/
	public static Scanner sc= new Scanner(System.in);
	
	/*Declaro un array tipo double de tamaño 5*/
	public static double myArray []=new double[5];
	
	/*Variable para recoger la elección del usuario */
	public static int opcionSeleccionada;
	
        /*Variable para evaluar el dato introducido */
        public static String stringIntroducido;
        public static Double numeroDouble;
        public static int numeroEntero;
        
	public static void main(String[] args) {
		
		/*Escribe un programa que pida al usuario 5 valores decimales del 0 al 100. 
		 * Se deben almacenar en un array y mostrarlos por consola.  
		 * Si el usuario introduce un valor incorrecto, se ha de volver a pedir */
		
                double primerosValores;
		int cont=0; /*para incrementar la posición del array mientras se rellena*/
		
                /*Rellenamos el array con 5 valores indicados por el usuario */
		do {
                    primerosValores = pideDouble("Introduce un número decimal entre 0 y 100.");
                    /*Verificamos que estan contenidos entre 00 y 100*/
			if (primerosValores>0 && primerosValores <100) {
				myArray[cont]=primerosValores;
				cont++;
			}else {
                            System.out.println("Valor incorrecto, no se ha guardado.");
			}
		}while(cont!=5);
			
		
		

		/*Con un do-while verificamos que se muestre el menú hasta que se introduzca un 0  */
		do {
			/*Mostramos el menú */
			System.out.println("=========================================");
			System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:");
			System.out.println("1. Modificar el valor almacenado en una posición.");
                        System.out.println("2. Mostrar el resultado de sumar todos los números. ");
                        System.out.println("3. Mostrar el número más alto y más bajo.");
                        System.out.println("4. Ordena el array situando primero todos los números pares y luego los impares.");
                        System.out.println("0 Finalizar.");

			System.out.println("¿Qué quieres hacer? ");
			opcionSeleccionada=sc.nextInt();
			/*Si la opción indicada es menor que 0*/
			/*Si se introduce un valor menor a 0, indica que se ha introducido un valor incorrecto y vuelve a mostrar el menú.*/
			if(opcionSeleccionada<0) {
				System.out.println("Opción incorrecta. Introduzca un valor entre 0 y 4.");
			}
			
			switch (opcionSeleccionada){
			
			case 1:
				modificarUnValor(myArray);
				mostrarArray(myArray);
				break;
				
			case 2:
				sumarValores(myArray);
				mostrarArray(myArray);
				break;
				
			case 3:
				menorYmayor(myArray);
				mostrarArray(myArray);
				break;
				
			case 4:
				ordenarParesImpares(myArray);
				mostrarArray(myArray);
				break;
			}
			
			/*Si el usuario introduce un 0, se ha de mostrar un mensaje de despedida y finalizar el programa */	
		}while(opcionSeleccionada!=0);
                    System.out.println("!Gracias por participar¡.");		
			
            }
        
	/*Cada vez que se realice la operación 1, 2, 3 y 4 
	 * se ha de mostrar por pantalla los valores almacenados en el array.  */
	public static void mostrarArray(double[] valores) {
		/*Mostramos el array por consola*/
		System.out.println("Los valores contenidos en el array son:" );
		 for(int i=0;i<valores.length;i++)
	        {
	            System.out.println("En la posición " + i + ": " + valores[i]);
	        }
	}
	
	
	/*modificarUnValor(double[] valores) : 
	 * en este caso se pedirá qué posición del array se quiere modificar 
	 * y su nuevo valor numérico entre 0 y 100 para situarlo en la posición indicada
	 * A continuación se deben mostrar todos los valores almacenados en el array.*/
	public static double[] modificarUnValor(double[] valores) {
        int posicionArray=0;
        double valorNuevo=0;
		posicionArray=pideEntero();
		if(posicionArray >0 && posicionArray<5 ) {
			System.out.println("Introduce un nuevo valor entre 0 y 100");
			valorNuevo=sc.nextDouble();
			if(valorNuevo>04 && valorNuevo<100) {
				valores[posicionArray]=valorNuevo;
			}else {
				System.out.println("No ha sido posible modificar el valor porque no esta comprendido entre 0 y 100.");

			}
		}else {
			System.out.println("No ha sido posible modificar esa posición ya que no existe en el array.");
		}
		return valores;
	}
		
	
	/*sumarValores(double[] valores) : 
	 * Sumar todos los números almacenados en el array y mostrar el resultado. */
	public static void sumarValores(double[] valores) {
		double sumaValoresAlmacenados=0;
		for(int i=0;i<valores.length; i++ ) {
			sumaValoresAlmacenados +=valores[i];
			
		}
		System.out.println("El resultado de sumar todos los valores del array es: " + sumaValoresAlmacenados); 
	}
	
	/*menorYmayor(double[] valores) : 
	 * muestra el número más  alto y el más bajo almacenados en el array. */
	public static void menorYmayor(double[] valores) {
		/*Empiezo a valora a partir del primer valor del array*/
		double numeroMasAlto=valores [0];
		double numeroMasBajo=valores [0];
		for(int i=0;i<valores.length; i++ ) {
			/*Si el valor actual del array es mayor que el numeroMasAlto lo guardo*/
			if(valores [i] > numeroMasAlto) {
				numeroMasAlto = valores[i];
            }
			/*Si el valor actual del array es menor que el numeroMasBajo lo guardo*/
            if(valores[i]<numeroMasBajo) {
            	numeroMasBajo = valores[i];
            }		
		}
		System.out.println("El número más alto es: " + numeroMasAlto); 
		System.out.println("El número más bajo es: " + numeroMasBajo); 
	}
	
	/* ordenarParesImpares(double[] valores) : 
	 * Ordena y retorna el array situando primero todos los números pares
	 *  y luego los impares */
	
	public static void ordenarParesImpares(double[] valores) { 
		/*Creo un nuevo array para guardar los valores ordenados del tamaño del array pasado como parámetro*/
		double [] nuevoArray= new double[valores.length];
		int posicionIzquierda=0; //contador para los números pares
		int posicionDerecha=valores.length-1; //contador para los números impares
		/**/
		for(int i=0; i<valores.length; i++) {
			
			if(valores[i]%2==0) {//Si el resto es 0 es que es par
				nuevoArray[posicionIzquierda]=valores[i];
				posicionIzquierda++;
			}else {
				nuevoArray[posicionDerecha]=valores[i];
				posicionDerecha--;
			}
		}
		System.out.println("Los valores del array ordenados.");
		mostrarArray(nuevoArray);
		System.out.println();
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
          
          
       
}
