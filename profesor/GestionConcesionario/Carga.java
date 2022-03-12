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
public class Carga extends Vehiculo {
    public Carga() {
        super();
    }
    double pma;

    public Carga(String matricula, String modelo, int n_plazas, double pma) {
        super(matricula, modelo, n_plazas);
        this.pma = pma;
    }

    @Override
    public double getPrecioTotalAlquilerPorDias() {
        double alquiler = super.getPrecioTotalAlquilerPorDias();
         
        alquiler+= (1.5 * pma);


        return alquiler;
    }

    @Override
    public String toString() {
       return  super.toString()+(" PMA:" + this.pma);
    }
    @Override
    public void pideDatos(){
        super.pideDatos();
        this.pma = Pregunta.pideDouble("Introduce el PMA del vehiculo de carga");
    }

}
