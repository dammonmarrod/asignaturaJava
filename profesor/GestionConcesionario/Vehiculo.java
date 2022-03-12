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
public abstract class Vehiculo implements IAlquilable {

    private String matricula;
    private String modelo;
    private int n_plazas;
    private int n_dias=1;
    private static final double alquiler_base_dia = 50;
    public Vehiculo() {
        super();
    }
    public int getPlazas(){
        return this.n_plazas;
    }
    public int getDias(){
        return this.n_dias;
    }
    public Vehiculo(String matricula, String modelo, int n_plazas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.n_plazas = n_plazas;
    }
    @Override
    public double getPrecioTotalAlquilerPorDias() {
        return alquiler_base_dia * this.n_dias;
    }

    @Override
    public String  toString() {
        
        return " Vehiculo:" 
                + " matricula=" + matricula +
                ", modelo=" + modelo 
                + ",plazas=" + n_plazas
                + ", dias=" + n_dias 
                +", precio:"+getPrecioTotalAlquilerPorDias();
    }
    @Override
    public void setNumeroDias(int n) {
        this.n_dias = n;
    }

   
    public void pideDatos() {
        this.matricula=Pregunta.pideString("Introduce la matricula");
        this.modelo=Pregunta.pideString("Introduce el modelo");
        this.n_plazas=Pregunta.pideValorMinMax(1, 9,"Indica el numero de plazas");
        this.n_dias=Pregunta.pideValorMinMax(1, 1000,"Indica el numero de dias de alquiler");
    }

}
