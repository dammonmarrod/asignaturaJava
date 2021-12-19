package actividad03_0485.ejercicio01.operaciones.algebraicas;

import actividad03_0485.ejercicio01.introduceDatos.Pregunta;

public class Operaciones {
    public static double variableOperar;
    public static double resultado;
    
    /*pida un número con decimales mediante pideDouble ,
    retorne el resultado de su raíz cuadrada y posteriormente se muestre por consola.*/
    
    
     public static void muestraRaizCuadrada() {
        System.out.println("============================================");
        boolean esPositivo=false;
        /*Da error la raiz cuadrada con números negativos, que los admite pideDouble*/
        do{
            variableOperar=Pregunta.pideDouble("Introduce un número double para calcular su raíz cuadrada:");
            if(variableOperar <0){
                System.out.println("El número introducido es negativo y no se puede hacer su raíz cuadrada.");
            }else{
               resultado = Math.sqrt(variableOperar);
               System.out.println("La raiz cuadrada de: " + variableOperar + " es: " + resultado);
               esPositivo=true;
            }
        }while(esPositivo !=true);
        System.out.println("");
    }
    
    /*que muestre el resultado de elevar el primer número
     al segundo utilizando la función pow de la clase Math
     */
      public static void calculaPotencia(double numero1,double numero2) {
        System.out.println("============================================");
        resultado=Math.pow(numero1, numero2);
        System.out.println("La potencia de: " + numero1 + " al: " + numero2 + " Es igual a: " + resultado); 
        System.out.println("");
    }
    
    
}
