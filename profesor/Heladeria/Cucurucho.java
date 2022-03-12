package actividad04_0485.ejercicio02;
/*3.	Añade al package una clase Cucurucho que herede de Comida y que permita estructurar la siguiente información: 
•	Un array de SaborHelado, para almacenar los sabores del cucurucho.
Añade como mínimo los siguientes métodos:
•	Constructor que establezca el nombre, precio base , kcal y número de bolas de helado que puede tener como máximo el cucurucho.  
•	Sobrescribe toString para que retorne una string con la información del cucurucho y de cada una de las bolas de helado que tiene.
•	addBolaHelado() debe recibir por parámetro una bola de helado , en qué posición de las bolas de helado que tiene el cucurucho se quiere añadir y añadirla si la posición es correcta. 
•	calculaPrecioTotal()  retorna la suma del precio base del cucurucho más el de todas las bolas de helado que tenga.
*/
public class Cucurucho extends Comida {
    SaborHelado[] sabores_helado;

    /*•	Constructor que establezca el sabor, precio base y número de bolas de helado que puede tener como máximo el cucurucho.  */
    public Cucurucho(String nombre, double precio, double kcal, int numeroBolas) {
        super(nombre, precio, kcal);
        sabores_helado= new SaborHelado[numeroBolas];
    }
    
    public String toString(){
        String text=super.toString();
        for(int k=0; k<sabores_helado.length;k++){
            if(sabores_helado[k]==null){
                text+="\n     bola"+k+"-";
            }else{
                text+="\n     bola"+k+"-"+sabores_helado[k].toString();
            }
            
                

            
        }

        return text;
    }
  
  /**debe recibir por parámetro una bola de helado , en qué posición de las bolas de helado que tiene el cucurucho se quiere añadir y añadirla si la posición es correcta. 
   * 
   * @param saborHelado
   * @param posicion
   */
    public void addBolaHelado(SaborHelado saborHelado, int posicion){
        if(posicion>=0 && posicion < sabores_helado.length){
            sabores_helado[posicion]=saborHelado;
        }else{
            System.out.println("Número de bola incorrecto. Como máximo puede tener"+ (sabores_helado.length-1));
        }
    }
/**retorna la suma del precio base del cucurucho más el de todas las bolas de helado que tenga.
 * 
 * @return
 */
    public double calculaPrecioTotal(){
        double totalPrecio=this.getPrecio();
        for(int k=0;k<sabores_helado.length;k++){
            totalPrecio+=sabores_helado[k].getPrecio();
        }
        return totalPrecio;
    }
}
