
package ejercicio01.cuentaCorriente;

import java.util.Scanner;

/*Una clase Utilidades que contendrá dos métodos para pedir datos al usuario:

pedirEntero. Recibe una pregunta como parámetro, 
    la muestra por consola y pide un dato al usuario hasta que el usuario 
    introduzca un valor entero válido.

pedirDoble. Recibe una pregunta como parámetro, 
    la muestra por consola y pide un dato al usuario hasta que el usuario 
    introduzca un valor doble válido. 
*/


public class Utilidades {
    //Scanner para introducir datos
    public static Scanner sc = new Scanner(System.in);
    
    //Variables
    public static String valorIntroducidoPregunta;//recoge el valor introducido en la pregutna
    public static boolean resultado;
   
   
    public static int pideEntero(String pregunta){
        int valor = 0;
        boolean esNumero=false;
        do{
            System.out.println(pregunta);
            valorIntroducidoPregunta=sc.nextLine();
            if(isNumericInt(valorIntroducidoPregunta)){//Si es número devolverá true
                valor=Integer.parseInt(valorIntroducidoPregunta);
                esNumero=true;
            }
        }while(esNumero != true);
        return valor;
    }
    
    /*Función que verifica que un String es un número entero*/
    public static boolean isNumericInt(String cadena) {
        try {
            Integer.parseInt(cadena);// el método Integer.parseInt arroja una excepción al pasarle una cadena sin un entero válido. 
            resultado = true;
        } catch (NumberFormatException excepcion) {
            /* Cuando la excepcion de tipo NumberFormatException ocurra, 
            entonces determinamos que la conversion ha fallado 
            y por lo tanto la cadena que se intento convertir
            , no es un numero, retornando FALSE. 
            En caso contrario nos retorna un TRUE.*/
            resultado = false;
        }
        return resultado;
    }
    
    
   
    public static double pideDouble (String pregunta){
        double valor = 0;
        boolean esNumero=false;
        do{
            System.out.println(pregunta);
            valorIntroducidoPregunta=sc.nextLine();
            if(isNumericDouble(valorIntroducidoPregunta)){//Si es número devolverá true
                valor=Double.parseDouble(valorIntroducidoPregunta);
                esNumero=true;
            }
        }while(esNumero != true);
        return valor;
    }
            
    
    
    /*Función que verifica que un String es un número double*/
    public static boolean isNumericDouble(String cadena) {
        try {
            Double.parseDouble(cadena);// el método Integer.parseInt arroja una excepción al pasarle una cadena sin un entero válido. 
            resultado = true;
        } catch (NumberFormatException excepcion) {
            /* Cuando la excepcion de tipo NumberFormatException ocurra, 
            entonces determinamos que la conversion ha fallado 
            y por lo tanto la cadena que se intento convertir
            , no es un numero, retornando FALSE. 
            En caso contrario nos retorna un TRUE.*/
            resultado = false;
        }
        return resultado;
    }
    
}
