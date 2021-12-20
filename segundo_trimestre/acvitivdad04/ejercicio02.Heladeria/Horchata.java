
package ejercicio02;

public class Horchata extends Comida{
    /*Atributos*/
    private double cantidad;
    private double porCientochufa;

    //Constructor
    public Horchata(){
    }
    
    /*Constructor por parámetros*/
   public Horchata(String nombre, double precio, double kcal, double cantidad, double porCientochufa){
       this.nombre=nombre;
       this.precio=precio;
       this.kcal=kcal;
       this.cantidad=cantidad;
       this.porCientochufa=porCientochufa;
   }
    
  
   /*	Sobrescribe toString para que retorne una string con la información de la comida
    Es muy común sobreescribir el método 'toString' en nuestras clases para que nos provea una información más significativa
    */
     public String toString() {
        return "nombre: " + nombre + ", precio: " + precio + "€" + ", " + kcal + "kcal, cantidad: " + cantidad + ", chufa: " + porCientochufa + "%"  ;
    }
    
    
    
}
