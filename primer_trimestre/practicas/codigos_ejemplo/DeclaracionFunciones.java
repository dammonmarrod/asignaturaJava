
package paquete;

import java.util.Scanner;


public class Clase3 {

   
    public static void main(String[] args) {
        
            saluda();
            int resultado = suma(2,3);
            System.out.println(resultado);
            
            System.out.println(suma(4,4));

    }
    
    static void saluda () {
        System.out.println("Hola que tal");
    }
    
    static int suma (int a, int b) {
        int resultado = a+b;
        return resultado;
    }
    
}
