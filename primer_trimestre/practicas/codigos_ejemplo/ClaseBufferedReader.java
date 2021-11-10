/* Escribe un programa de nombre PidiendoValores  que llame a una función encargada de 
pedir un número entero superior a 0. Si el usuario escribe un número incorrecto, vuelve a 
pedir. Cuando el usuario haya escrito un número correcto la función ha de retornar ése 
número y desde la función main se ha de mostrar el número introducido. */

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
public class PidiendoValores { 
 
    public static void main(String[] args) { 
       int num=getEnteroSuperior0(); 
       System.out.println("Numero>0: "+num); 
    } 
 
    public static int getEnteroSuperior0() { 
        String numeroEscrito; 
        int numero = 0; 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        do { 
             System.out.println("Introduce un numero > 0"); 
            try { 
                numeroEscrito = br.readLine(); 
                numero = Integer.parseInt(numeroEscrito); 
            } catch (IOException e) { 
                System.out.println("Error al intentar acceder al teclado"); 
            }catch( NumberFormatException e2){ 
                 System.out.println("Debes introducir un valor numérico"); 
            } 
 
        } while (numero <1); 
        return numero; 
    } 
}
