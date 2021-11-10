
package paquete;

import java.util.Scanner;


public class Clase3 {

    public static void main(String[] args) {
 
            
            String cadena = "hola que tal";
            cadena = "estoy muy bien aprendiendo Java";
            
            System.out.println("Tamaño: "+cadena.length());
            System.out.println("Letra posición 0: "+cadena.charAt(0));
            System.out.println("Letra posición 4: "+cadena.charAt(4));
            
            for (int i = 0; i < cadena.length(); i++) {
                System.out.println("Letra posición "+(i+1)+": "+cadena.charAt(i));
            }
            
            System.out.println("¿Contiene una j? "+cadena.contains("j"));
            System.out.println("¿Contiene una a? "+cadena.contains("a"));
            System.out.println("¿Contiene una ava? "+cadena.contains("ava"));
            
            System.out.println("Dime la primera posición de una a: "+cadena.indexOf("a"));
            System.out.println("Dime la primera posición de una j: "+cadena.indexOf("j"));
        
            System.out.println("Dime la última posición de una a: "+cadena.lastIndexOf("a"));

            System.out.println("Cortar cadena (palabra bien): "+cadena.substring(10, 14));
            
            System.out.println("Cifrando: "+cadena.replace("a", "*"));
        
     
    }
    
   
    
}
