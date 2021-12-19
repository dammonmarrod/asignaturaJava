
package ejercicio01.cuentaCorriente;
import ejercicio01.cuentaCorriente.Utilidades;

public class Cuenta {
    /*Atributos*/
    private int numeroCuenta;
    private double saldo;
    private String nombreTitular;

   /*Constructor por parámetros*/
   public Cuenta(int numeroCuenta, double saldo, String nombreTitular){
       this.numeroCuenta=numeroCuenta;
       this.saldo=saldo;
       this.nombreTitular=nombreTitular;
   }
   
   /*Getters*/
   //getNumeroCuenta. Devuelve el número de la cuenta
    public int getNumeroCuenta() {
       return numeroCuenta;
    }
    //getSaldo. Devuelve el saldo de la cuenta.
     public double getSaldo() {
        return saldo;
    }
    // getTitular. Devuelve el nombre del titular de la cuenta.
    public String getNombreTitular() {
        return nombreTitular;
    }
    

    /*Setters*/
     
    //setSaldo. Inicializa el saldo de la cuenta.
    public void setSaldo(double saldo) { 
        this.saldo = saldo;
    }

    
    //setTitular. Inicializa el nombre del titular de la cuenta
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    
            
    
    
}
