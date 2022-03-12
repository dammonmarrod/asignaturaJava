/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio03.vehiculos;

import actividad04_0485.ejercicio03.pideDatos.Pregunta;

/**
 *
 * @author Cristian
 */
public class Coche extends Vehiculo {
    private String gama="A";
    public Coche(String matricula, String modelo, int n_plazas, String gama) {
        super(matricula, modelo, n_plazas);
        this.gama = gama;
    }

    public Coche() {
        super();
    }
  
    
    @Override
    public double getPrecioTotalAlquilerPorDias(){
        /*En el caso de alquiler de un coche, al precio base se le 
        suma la cantidad de 1.5 € por plaza y día.
        */
        
        double alquiler = super.getPrecioTotalAlquilerPorDias()
                + (1.5* getPlazas()*getDias());
        return alquiler;
    }
    @Override
        public String toString() {
            return super.toString()+(" Gama del coche:"+this.gama);
        }
@Override
    public void pideDatos() {
        super.pideDatos();
        this.gama=Pregunta.pideString("Indica la gama");
        
    }
}
