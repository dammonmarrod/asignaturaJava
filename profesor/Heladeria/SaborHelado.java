package actividad04_0485.ejercicio02;
/**4.	Añade al package una clase SaborHelado que herede de Comida y que permita estructurar la información de distintas bolas de helado, de manera que pueda almacenar: 
 
•	% de grasa
•	Tipo de edulcorante
Añade como mínimo los siguientes métodos:
•	Constructor que establezca los atributos.
•	Sobrescribe toString para que retorne una string con la información de la bola de helado.

 * 
 */
public class SaborHelado extends Comida{
    private double porcentaje_grasa;
    private String tipo_edulcorante;

    
    public String toString() {
        String text =super.toString()+" grasa:"+porcentaje_grasa+"%, edulcorante:"+tipo_edulcorante;
        return text;
    }

    public SaborHelado(String nombre, double precio, double kcal, double porcentaje_grasa, String tipo_edulcorante) {
        super(nombre, precio, kcal);
        this.porcentaje_grasa = porcentaje_grasa;
        this.tipo_edulcorante = tipo_edulcorante;
    }
}
