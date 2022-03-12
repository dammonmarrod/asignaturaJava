package actividad04_0485.ejercicio02;
/*1.	En el package actividad07.ejercicio02 desarrolla una clase Comida que permita estructurar la siguiente información de una comida: 
 
•	Nombre
•	precio
•	kcal
 
Añade como mínimo los siguientes métodos:
•	Getters/Setters para los atributos
•	Sobrescribe toString para que retorne una string con la información de la comida.
*/
public class Comida {
    private String nombre;
    private double precio;
    private double kcal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public Comida(String nombre, double precio, double kcal) {
        this.nombre = nombre;
        this.precio = precio;
        this.kcal = kcal;
    }

    public String toString() {
        String texto = " nombre: " + nombre + ", " + kcal + "kcal, precio:" + precio + "€";
        return texto;
    }

}
