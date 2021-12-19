
package actividad03_0485.ejercicio01.operaciones;

import actividad03_0485.ejercicio01.introduceDatos.Pregunta;

public class Valores {
    
    
    /* muestraPi : que simplemente muestre por consola el valor PI de la clase Math*/
    public static void muestraPi(){
        System.out.println("============================================");
        System.out.println("Pi es " + Math.PI); 
        System.out.println("");
    }
    
   
    
    /* Si se opta por la usar la función random de la clase Math, esta función 
    nos devuelve un número aleatorio entre 0 y 1 
    (de tipo double)*/
    /*
    solo es necesario multiplicarlo por el número que queramos que sea el número más alto
    posible y/o sumarle (o restarle) algún número
    para que el limite inferior sea otro distinto de 0
    */
    /*
    En general, para conseguir un número entero entre M y N 
    con M menor que N y ambos incluídos, debemos usar esta fórmula 
    int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.
    */
    
    /*Si no queremos un valor entero sino double, la fórmula es sin el +1 
      double valorAleatorio = Math.random()*(N-M)+M;
    eso sí, recuerda que el valor N queda excluido y no saldrá nunca. 
    */
    
    
    
    /*muestraValorAleatorio que pida un número mediante pideEntero 
    y muestre por consola un número aleatorio entre 0 y el número introducido
    */
    public static void muestraValorAleatorio(){
        int numeroIntroducido;
        numeroIntroducido =Pregunta.pideEntero("Introduce el número, y te mostraré un valor aleatorio entre 0 y el número introducido ");
        
        int valorAleatorio = (int)(Math.random()*numeroIntroducido+1);  // Valor entre M y N, ambos incluidos.

        System.out.println("El número aleatorio es: " + valorAleatorio);
        
    }
}
