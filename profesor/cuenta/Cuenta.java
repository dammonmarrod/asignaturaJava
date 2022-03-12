/*
 * Desarrollar una clase Cuenta, que tendrán los siguientes atributos: un
 * número de cuenta que las identifica, un saldo, y el nombre del titular.
 */
package actividad04_0485.ejercicio01;

/**
 *
 * @author Linkia
 */
public class Cuenta {

    private final double numeroCuenta;     // no se puede modificar
    private String nombre;
    private double saldo;
/*La clase debe incorporar un constructor que reciba como parámetros todos los atributos*/
    public Cuenta(int numeroCuenta, String nombre, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
   
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    

}
