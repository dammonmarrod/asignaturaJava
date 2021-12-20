
package ejercicio02;

public class Comida {
    /*Atributos*/
    String nombre;
    double precio;
    double kcal;

    //Constructor
    public Comida(){
    }
    
   /*Constructor por parámetros*/
   public Comida(String nombre, double precio, double kcal){
       this.nombre=nombre;
       this.precio=precio;
       this.kcal=kcal;
   }
   
   /*Getters*/
   //getNombre. Devuelve el nombre de la comida
    public String getNombre() {
       return nombre;
    }
    //getPrecio. Devuelve el precio de la comida.
     public double getPrecio() {
        return precio;
    }
    // getKcal. Devuelve las Kcal de la comida.
    public double getKcal() {
        return kcal;
    }
    

    /*Setters*/
   //setNombre. Modifica el nombre de la comida
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }
    //setPrecio. Modifica el precio de la comida
    public void setPrecio(double precio) { 
        this.precio = precio;
    }
    //setKcal. Modifica las Kcal de la comida
    public void setKcal(double kcal) {
        this.kcal = kcal;
    }
    
    /*	Sobrescribe toString para que retorne una string con la información de la comida
    Es muy común sobreescribir el método 'toString' en nuestras clases para que nos provea una información más significativa
    */
    public String toString() {
        return "nombre: " + nombre + ", precio: " + precio + "€" + ", " + kcal + "kcal." ;
    }
    
}
