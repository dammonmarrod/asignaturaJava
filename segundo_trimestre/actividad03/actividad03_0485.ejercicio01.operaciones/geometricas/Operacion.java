
package actividad03_0485.ejercicio01.operaciones.geometricas;

import actividad03_0485.ejercicio01.introduceDatos.Pregunta;

public class Operacion {
    
    public static double variableOperar;
    public static double resultado;
    
    /*muestraSeno: que reciba un número con decimales por parámetro y muestre su seno*/
     public static void muestraSeno() {
        System.out.println("============================================");
        variableOperar=Pregunta.pideDouble("Introduce el valor del seno que quieras calcular. ");
        //¿Estás tratando de usar grados? Tenga en cuenta que sin y cos están esperando radianes.
        resultado=Math.sin(Math.toRadians(variableOperar));
        System.out.println("El seno de : " + variableOperar + " es: " + resultado); 
        System.out.println("");
    }
    
    /*muestraCoseno: que reciba un número con decimales por parámetro,  
    retorne su coseno y se muestre por consola.*/
     public static void muestraCoseno() {
        System.out.println("============================================");
        variableOperar=Pregunta.pideDouble("Introduce el valor del coseno que quieras calcular. ");
        //¿Estás tratando de usar grados? Tenga en cuenta que sin y cos están esperando radianes.
        resultado=Math.cos(Math.toRadians(variableOperar));
        System.out.println("El coseno de : " + variableOperar + " es: " + resultado); 
        System.out.println("");
    }
    
    
}
