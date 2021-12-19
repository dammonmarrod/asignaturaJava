package ejercicio01.cuentaCorriente;
import ejercicio01.cuentaCorriente.Utilidades;
import ejercicio01.cuentaCorriente.Cuenta;

import java.util.Scanner;

public class TestCuenta {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int numeroCuenta;
        double saldoIngresar;
        double saldoSacar;
        double saldoModificado;
        int opcion; //Guardaremos la opcion del usuario
        
        /*Creamos las cuentas*/
        Cuenta cuenta_1= new Cuenta (1,10.0,"Antonia");
        Cuenta cuenta_2= new Cuenta (2,20.0,"Luisa");
        Cuenta cuenta_3= new Cuenta (3,30.0,"Valentina");   
         
        
      /*Menu principal de opciones*/ 
      do{
           System.out.println("1. Consultar saldo.");
           System.out.println("2. Ingresar dinero.");
           System.out.println("3. Sacar dinero.");
           System.out.println("4. Realizar Transferencia.");
           System.out.println("0. No quieres realizar ninguna operación más.");
           
           opcion=Utilidades.pideEntero("Elige una de estas opciones: ");
           switch(opcion){
               case 1:
                   //Consultar saldo: ha de preguntar la cuenta  y mostrar el saldo que tiene.
                   System.out.println("Has seleccionado la opcion 1. Consultar saldo.");
                   numeroCuenta=Utilidades.pideEntero("Introduce el número de cuenta que quieres mostrar");
                   if(numeroCuenta ==cuenta_1.getNumeroCuenta()){
                      System.out.println(cuenta_1.getSaldo());
                   }else if(numeroCuenta == cuenta_2.getNumeroCuenta()){
                      System.out.println(cuenta_2.getSaldo());
                   }else if(numeroCuenta == cuenta_3.getNumeroCuenta()){
                       System.out.println(cuenta_3.getSaldo());
                   }else{
                     System.out.println("No existe número de cuenta.");
                   }
                   break;
               case 2:
                   //Ingresar dinero: ha de preguntar la cuenta y añadir el saldo a la cuenta correspondiente.
                   System.out.println("Has seleccionado la opcion 2. Ingresar dinero.");
                   numeroCuenta=Utilidades.pideEntero("Introduce el número de cuenta donde quieres ingresar dinero: ");
                   if(numeroCuenta ==cuenta_1.getNumeroCuenta()){
                       /*Tengo que modificar el saldo que será el resultado de la suma
                       de lo que ya tengo cuenta_1.getSaldo() 
                       y del saldo que me ha dicho el cliente.*/
                       saldoIngresar=Utilidades.pideDouble("¿Cuanto dinero quieres ingresar?");
                       saldoModificado=cuenta_1.getSaldo() + saldoIngresar;
                       cuenta_1.setSaldo(saldoModificado);
                       System.out.println("El saldo actual de la cuenta 1 es: " + cuenta_1.getSaldo());
                   }else if(numeroCuenta == cuenta_2.getNumeroCuenta()){
                      saldoIngresar=Utilidades.pideDouble("¿Cuanto dinero quieres ingresar?");
                      saldoModificado=cuenta_2.getSaldo() + saldoIngresar;
                      cuenta_2.setSaldo(saldoModificado);
                      System.out.println("El saldo actual de la cuenta 2 es: " + cuenta_2.getSaldo());
                   }else if(numeroCuenta == cuenta_3.getNumeroCuenta()){
                      saldoIngresar=Utilidades.pideDouble("¿Cuanto dinero quieres ingresar?");
                      saldoModificado=cuenta_3.getSaldo() + saldoIngresar;
                      cuenta_3.setSaldo(saldoModificado);
                      System.out.println("El saldo actual de la cuenta 3 es: " + cuenta_3.getSaldo());
                   }else{
                     System.out.println("No existe número de cuenta.");
                   }
                   break;
                case 3:
                   //Sacar dinero: ha de preguntar la cuenta, el saldo a sacar y mostrar el saldo restante.
                   System.out.println("Has seleccionado la opcion 3. Sacar dinero.");
                   numeroCuenta=Utilidades.pideEntero("Introduce el número de cuenta donde quieres sacar dinero: ");
                   if(numeroCuenta ==cuenta_1.getNumeroCuenta()){
                       /*Tengo que modificar el saldo que en este caso será el resultado de la 
                       resta
                       de lo que ya tengo cuenta_1.getSaldo() 
                       y del saldo que me ha dicho el cliente.*/
                       saldoSacar=Utilidades.pideDouble("¿Cuanto dinero quieres sacar?");
                       saldoModificado=cuenta_1.getSaldo() - saldoSacar;
                       //Si el resultado de saldoModificado es negativo no se realiza la operación
                       if(saldoModificado<0){
                           System.out.println("No es posible realizar la operación ya que no tienes saldo suficiente");
                       }else{
                            cuenta_1.setSaldo(saldoModificado);
                            System.out.println("El saldo actual de la cuenta 1 es: " + cuenta_1.getSaldo());
                       }   
                   }else if(numeroCuenta == cuenta_2.getNumeroCuenta()){
                      saldoSacar=Utilidades.pideDouble("¿Cuanto dinero quieres sacar?");
                      saldoModificado=cuenta_2.getSaldo() - saldoSacar;
                      //Si el resultado de saldoModificado es negativo no se realiza la operación
                       if(saldoModificado<0){
                            System.out.println("No es posible realizar la operación ya que no tienes saldo suficiente");
                       }else{
                            cuenta_2.setSaldo(saldoModificado);
                            System.out.println("El saldo actual de la cuenta 2 es: " + cuenta_2.getSaldo());
                       }     
                   }else if(numeroCuenta == cuenta_3.getNumeroCuenta()){
                      saldoSacar=Utilidades.pideDouble("¿Cuanto dinero quieres sacar?");
                      saldoModificado=cuenta_3.getSaldo() - saldoSacar;
                      //Si el resultado de saldoModificado es negativo no se realiza la operación
                       if(saldoModificado<0){
                            System.out.println("No es posible realizar la operación ya que no tienes saldo suficiente");
                       }else{
                            cuenta_3.setSaldo(saldoModificado);
                            System.out.println("El saldo actual de la cuenta 3 es: " + cuenta_3.getSaldo());
                       }    
                   }else{
                     System.out.println("No existe número de cuenta.");
                   }
                   break;
                case 4:
                    //Realizar transferencia: ha de sacar el dinero de una cuenta para meterlo en otra.
                    System.out.println("Has seleccionado la opcion 4. Realizar Transferencia.");
                    numeroCuenta=Utilidades.pideEntero("Introduce el número de cuenta donde quieres sacar dinero: ");
                    if(numeroCuenta ==cuenta_1.getNumeroCuenta()){//En cuenta 1
                       saldoSacar=Utilidades.pideDouble("¿Cuanto dinero quieres sacar?");
                       saldoModificado=cuenta_1.getSaldo() - saldoSacar;
                       //Si el resultado de saldoModificado es negativo no se realiza la operación
                       if(saldoModificado<0){
                           System.out.println("No es posible realizar la operación ya que no tienes saldo suficiente");
                       }else{
                            cuenta_1.setSaldo(saldoModificado);
                            numeroCuenta=Utilidades.pideEntero("Introduce el número de cuenta donde quieres ingresar dinero: ");
                            if(numeroCuenta ==cuenta_2.getNumeroCuenta()){
                                saldoModificado=cuenta_2.getSaldo() + saldoSacar;
                                cuenta_2.setSaldo(saldoModificado);
                                System.out.println("El saldo actual de la cuenta 1 es: " + cuenta_1.getSaldo());
                                System.out.println("El saldo actual de la cuenta 2 es: " + cuenta_2.getSaldo());
                            }else if(numeroCuenta ==cuenta_3.getNumeroCuenta()){
                                saldoModificado=cuenta_3.getSaldo() + saldoSacar;
                                cuenta_3.setSaldo(saldoModificado);
                                System.out.println("El saldo actual de la cuenta 1 es: " + cuenta_1.getSaldo());
                                System.out.println("El saldo actual de la cuenta 3 es: " + cuenta_3.getSaldo());
                            }else{
                              System.out.println("No existe número de cuenta.");  
                            }  
                       }   
                   }else if(numeroCuenta == cuenta_2.getNumeroCuenta()){//En cuenta 2
                      saldoSacar=Utilidades.pideDouble("¿Cuanto dinero quieres sacar?");
                       saldoModificado=cuenta_2.getSaldo() - saldoSacar;
                       //Si el resultado de saldoModificado es negativo no se realiza la operación
                       if(saldoModificado<0){
                           System.out.println("No es posible realizar la operación ya que no tienes saldo suficiente");
                       }else{
                            cuenta_2.setSaldo(saldoModificado);
                            numeroCuenta=Utilidades.pideEntero("Introduce el número de cuenta donde quieres ingresar dinero: ");
                            if(numeroCuenta ==cuenta_1.getNumeroCuenta()){
                                saldoModificado=cuenta_1.getSaldo() + saldoSacar;
                                cuenta_1.setSaldo(saldoModificado);
                                System.out.println("El saldo actual de la cuenta 1 es: " + cuenta_1.getSaldo());
                                System.out.println("El saldo actual de la cuenta 2 es: " + cuenta_2.getSaldo());
                            }else if(numeroCuenta ==cuenta_3.getNumeroCuenta()){
                                saldoModificado=cuenta_3.getSaldo() + saldoSacar;
                                cuenta_3.setSaldo(saldoModificado);
                                System.out.println("El saldo actual de la cuenta 2 es: " + cuenta_2.getSaldo());
                                System.out.println("El saldo actual de la cuenta 3 es: " + cuenta_3.getSaldo());
                            }else{
                              System.out.println("No existe número de cuenta.");  
                            }  
                       }     
                   }else if(numeroCuenta == cuenta_3.getNumeroCuenta()){//Cuenta 3
                      saldoSacar=Utilidades.pideDouble("¿Cuanto dinero quieres sacar?");
                       saldoModificado=cuenta_3.getSaldo() - saldoSacar;
                       //Si el resultado de saldoModificado es negativo no se realiza la operación
                       if(saldoModificado<0){
                           System.out.println("No es posible realizar la operación ya que no tienes saldo suficiente");
                       }else{
                            cuenta_3.setSaldo(saldoModificado);
                            numeroCuenta=Utilidades.pideEntero("Introduce el número de cuenta donde quieres ingresar dinero: ");
                            if(numeroCuenta ==cuenta_1.getNumeroCuenta()){
                                saldoModificado=cuenta_1.getSaldo() + saldoSacar;
                                cuenta_1.setSaldo(saldoModificado);
                                System.out.println("El saldo actual de la cuenta 1 es: " + cuenta_1.getSaldo());
                                System.out.println("El saldo actual de la cuenta 3 es: " + cuenta_3.getSaldo());
                            }else if(numeroCuenta ==cuenta_2.getNumeroCuenta()){
                                saldoModificado=cuenta_2.getSaldo() + saldoSacar;
                                cuenta_2.setSaldo(saldoModificado);
                                System.out.println("El saldo actual de la cuenta 2 es: " + cuenta_2.getSaldo());
                                System.out.println("El saldo actual de la cuenta 3 es: " + cuenta_3.getSaldo());
                            }else{
                              System.out.println("No existe número de cuenta.");  
                            }  
                       }    
                   }else{
                     System.out.println("No existe número de cuenta.");
                   }
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
          System.out.println(""); 
       }
      while(opcion !=0);  
    }
    
}
