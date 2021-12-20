
package ejercicio02;


public class Cucurucho extends Comida {
    
    /*Atributos*/
    private static String[] saborHelado=new String[4];
   
    //Constructor
    public Cucurucho(){
    }
    
    
     public Cucurucho(String nombre, double precio, double kcal, String[] saborHelado ){
         this.nombre=nombre;
         this.precio=precio;
         this.kcal=kcal;
         this.saborHelado=saborHelado;
         
    }
    
    /*	Sobrescribe toString para que retorne una string con la información del saborHElado
    Es muy común sobreescribir el método 'toString' en nuestras clases para que nos provea una información más significativa
    */
    
    @Override
    public String toString() {
        //La clase StringBuilder su tamaño y contenido pueden modificarse
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i=0; i<saborHelado.length; i++){
            stringBuilder.append("\n");//para separar las bolas de helado
            stringBuilder.append("bola" + i  + ".- "+ saborHelado[i] +"\t"); 
        }
        String bolasHelado=stringBuilder.toString();
        return "nombre: " + nombre + ", precio: " + precio + "€" + ", " + kcal + "kcal." + bolasHelado; 
    }   
}

