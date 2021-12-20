
package ejercicio02;
import ejercicio02.Comida;
import ejercicio02.Cucurucho;
import ejercicio02.Horchata;
import ejercicio02.SaborHelado;
import java.util.Scanner;

public class Heladeria {
    //Scanner para introducir datos
    public static Scanner sc = new Scanner(System.in);
    //Variables
    public static String valorIntroducidoPregunta;//recoge el valor introducido en la pregutna
    public static boolean resultado;
    
    public static void main(String[] args){
      
      int opcion; //Guardaremos la opcion del usuario
      
      do{
           System.out.println("1. Muestra menú.");
           System.out.println("2. Modifica el menú.");
           System.out.println("0. No quieres realizar ninguna operación más.");
           
           opcion=pideEntero("Elige una de estas opciones: ");
           switch(opcion){
               case 0:
                   break;
               case 1:
                   System.out.println("Has seleccionado la opcion 1.Muestra el menú.");
                   muestraMenu();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2. Modifica el menú.");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 2");
           }
          System.out.println(""); 
       }
      while(opcion !=0);
    }
        
    

    public static void muestraMenu(){
         
        //Creamos un array de objetos de la clase Heladeria
        String [] pedido= new String[4];
            
        
        Comida comida_1 = new Comida("cacahuetes",1.5,99);
        //System.out.println(comida_1.toString());
        Horchata horchata_1 = new Horchata("horchata", 2.5,20.0,250.0,30.0);
        //System.out.println(horchata_1.toString());
        SaborHelado sabor_vainilla= new SaborHelado("vainilla", 1.0,30.0,15.0,"azúcar");
        SaborHelado sabor_chocolate= new SaborHelado("chocolate",1.0,15.0,15.0,"aspartamo");
        SaborHelado sabor_cookies= new SaborHelado("cookies",1.25,35.0,20.0,"azucar");
        SaborHelado sabor_fresa= new SaborHelado("fresa",1.0,10.0,5.0,"aspartamo");
        //System.out.println(sabor_vainilla.toString());
        
       String[] sabores_cucurucho_1={sabor_vainilla.toString(),sabor_chocolate.toString()}; 
       Cucurucho cucurucho_1 = new Cucurucho("chocolate", 1.0, 20.0,sabores_cucurucho_1 );
       //System.out.println(cucurucho_1.toString());
       String[] sabores_cucurucho_2={sabor_cookies.toString(),sabor_fresa.toString()}; 
       Cucurucho cucurucho_2 = new Cucurucho("galleta", 1.5, 25.0,sabores_cucurucho_2 );
        
        
               
        System.out.println("Información del pedido:");
        pedido[0]= comida_1.toString();
        pedido[1]=horchata_1.toString();
        pedido[2]=cucurucho_1.toString();
        pedido[3]=cucurucho_2.toString();
      
        
        for(int i=0; i<pedido.length; i++){
            System.out.println(i +".- " + pedido[i]);
        }
        
    }


     /*funciones  int pideEntero(String pregunta) 
    encargadas de mostrar por consola la pregunta pasada como parámetro,
    pedir un número por consola (si el usuario no introduce un valor 
    correcto ha de volver a pedir el valor hasta
    que el usuario introduzca un valor correcto) 
    y retornar el número introducido como un int*/
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
    
    
}
