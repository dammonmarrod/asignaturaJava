
package ejercicio02;


public class SaborHelado extends Comida {
    
     /*Atributos*/
    private double porCientoGrasa;
    private String tipoEdulcorante;

    //Constructor
    public SaborHelado(){
    }
    
   /*Constructor por parámetros*/
   public SaborHelado(String nombre, double precio, double kcal, double porCientoGrasa, String tipoEdulcorante){
        this.nombre=nombre;
        this.precio=precio;
        this.kcal=kcal;
        this.porCientoGrasa=porCientoGrasa;
        this.tipoEdulcorante=tipoEdulcorante;
   }
   
   
   /*	Sobrescribe toString para que retorne una string con la información del saborHElado
    Es muy común sobreescribir el método 'toString' en nuestras clases para que nos provea una información más significativa
    */
    public String toString() {
        return "nombre: " + nombre + ", precio: " + precio + "€" + ", " + kcal + "kcal, grasa: "  + porCientoGrasa + "%; y su edulcorante es " + tipoEdulcorante + ".";
    }
   
}
