package actividad04_0485.ejercicio02;
/*2.	Añade al package una clase Horchata que herede de Comida y que permita estructurar la siguiente información: 
 
•	cantidad
•	% de chufa
Añade como mínimo los siguientes métodos:
•	Getters/Setters para los atributos
•	Constructor que establezca los atributos anteriores.
•	Sobrescribe toString para que retorne una string con la información de la comida.
*/
public class Horchata extends Comida {
    private double cantidad;
    private double porcentaje_chufa;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPorcentaje_chufa() {
        return porcentaje_chufa;
    }

    public void setPorcentaje_chufa(double porcentaje_chufa) {
        this.porcentaje_chufa = porcentaje_chufa;
    }

  
    public String toString(){
        String text=super.toString()+", cantidad:"+cantidad+", chufa:"+porcentaje_chufa+"%";
        return text;
    }

    public Horchata(String nombre, double precio, double kcal, double cantidad, double porcentaje_chufa) {
        super(nombre, precio, kcal);
        this.cantidad = cantidad;
        this.porcentaje_chufa = porcentaje_chufa;
    }
    
}
