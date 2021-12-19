package actividad03_0485.ejercicio01.main;

import actividad03_0485.ejercicio01.introduceDatos.Pregunta;
import actividad03_0485.ejercicio01.operaciones.Valores;
import actividad03_0485.ejercicio01.operaciones.algebraicas.Operaciones;
import actividad03_0485.ejercicio01.operaciones.geometricas.Operacion;

import java.util.Scanner;
        
public class Ejercicio01 {
    public static void main(String[] args){
          
      Scanner sc = new Scanner(System.in);
      int opcion; //Guardaremos la opcion del usuario
      
      do{
           System.out.println("1. Muestra Pi.");
           System.out.println("2. Muestra Valor Aleatorio.");
           System.out.println("3. Muestra Raiz Cuadrada.");
           System.out.println("4. Calcula Potencia.");
           System.out.println("5. Muestra Seno.");
           System.out.println("6. Muestra Coseno.");
           System.out.println("0. No quieres realizar ninguna operación más.");
           
           opcion=Pregunta.pideEntero("Elige una de estas opciones: ");
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1.Muestra Pi.");
                   Valores.muestraPi();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2. Muestra valor aleatorio.");
                   Valores.muestraValorAleatorio();
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3. Muestra raiz cuadrada.");
                   Operaciones.muestraRaizCuadrada();
                   break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4. Calcula potencia.");
                    double valor1=Pregunta.pideDouble("Introduce el primer valor double:");
                    double valor2=Pregunta.pideDouble("Introduce el segundo valor double:");
                    Operaciones.calculaPotencia(valor1, valor2);
                   break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5. Muestra Seno");
                    Operacion.muestraSeno();
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 6");
                   Operacion.muestraCoseno();
                   break;
                default:
                   System.out.println("Solo números entre 1 y 6");
           }
          System.out.println(""); 
       }
      while(opcion !=0);
    }
    
}
