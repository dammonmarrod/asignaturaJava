
package paquete;
import java.util.Scanner;

public class CreacionArrays {
  
    public static void main(String[] args) {

        //Creacción de array
        int[] dato = new int[10];
      
        //Acceso a los arrays
        System.out.println(dato);
        dato[0]=10;
        System.out.println("Celda 0: "+dato[0]);
        System.out.println("Celda 1: "+dato[1]);
        
      
         //Mostrar array
         System.out.println("-----------------------");
            for(int i=0; i<array.length;i++) System.out.println(array[i]);
      
      
        //Atributos de los arrays
        System.out.println("Tamaño: "+dato.length);
        
        //Métodos de los Arrays
        System.out.println("Valores: "+dato.toString());
       
        //Definición de un array por teclado
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int n = s.nextInt();
        if (n<1) System.out.println("Error, no se permiten valores 0 o negativos");
        else {
            int[] array = new int[n];
            for (int i=0;i<array.length;i++) {
                System.out.println("Introduce el valor número "+(i+1));
                array[i] = s.nextInt();
            }
            System.out.println("-----------------------");

        //Mostrar el array desde la última posición a la primera 
            for(int i=array.length-1;i>=0;i--) System.out.println(array[i]);

         //Modificar valores según su posición
            System.out.println("Introduce una posición a modificar (de la 1 a la "+n+")");
            int pos = s.nextInt();
            if (pos<1||pos>n) System.out.println("Error, esa posición no existe");
            else {
                System.out.println("Introduce el nuevo valor");
                array[pos-1] = s.nextInt();
            }

       
  }
          
           
}
