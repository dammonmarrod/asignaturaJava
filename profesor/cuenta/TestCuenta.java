/*
 * Crear un programa con el método main en el que se creen al menos dos cuentas.
 * Crear un menú principal con las siguientes opciones:
 *    Consultar saldo.
 *    Ingresar dinero.
 *    Sacar dinero.
 *    Realizar transferencia (sacar dinero de una cuenta para meterlo en otra).
 */
package actividad04_0485.ejercicio01;

import static actividad04_0485.ejercicio01.Utilidades.pedirDoble;
import static actividad04_0485.ejercicio01.Utilidades.pedirEntero;

/**
 *
 * @author Linkia
 */
public class TestCuenta {

    // Variables para almanecear las cuentas
    private static Cuenta uno;
    private static Cuenta dos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se inicializan las dos cuentas
        uno = new Cuenta(1, "Primera cuenta de ejemplo", 2000);
        dos = new Cuenta(2, "Segunda cuenta de ejemplo", 564.34);
        int opcion;
        do {
            menuPrincipal();
            opcion = pedirEntero("Escoge una opción");
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    ingresarDinero();
                    break;
                case 3:
                    retirarDinero();
                    break;
                case 4:
                    transferencia();
                    break;
                case 0:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    ;
            }
        } while (opcion != 0);
    }
        // Método que muestra el saldo de una cuenta
    private static void consultarSaldo() {
        Cuenta cuentaSeleccionada = seleccionarCuenta("Indique el nº de la cuenta de la que quiera saber el saldo:");
        System.out.println("Saldo de la cuenta de: " + cuentaSeleccionada.getNombre());
        System.out.println(cuentaSeleccionada.getSaldo() + " €");
    }

    // Método para realizar una transferencia
    private static void transferencia() {
        Cuenta origen = seleccionarCuenta("Indique el nº de la cuenta de origen: ");
        Cuenta destino = seleccionarCuenta("Indique el nº de la cuenta que va a recibir el dinero: ");
        if (origen.getNumeroCuenta() == destino.getNumeroCuenta()) {
            System.out.println("No tiene sentido una transferencia con la misma cuenta de origen y destino");
        } else {
            double cantidad = pedirCantidad("Indique la cantidad a transferir.", "Nose pueden hacer transferencias negativas.");
            if (cantidad > origen.getSaldo()) {
                System.out.println("La cuenta de origen no dispone de tanto dinero. No se puede efectuar la transferencia.");
            } else {
                // descontamos dinero del origen
                origen.setSaldo(origen.getSaldo() - cantidad);
                // añadims el dinero al destino
                destino.setSaldo(destino.getSaldo() + cantidad);
                System.out.println("Saldo de la cuenta emisora: " + origen.getSaldo());
                System.out.println("Saldo de la cuenta receptora: " + destino.getSaldo());
            }
        }
    }

    // Método para retirar dinero de una cuenta
    private static void retirarDinero() {
        Cuenta cuentaSeleccionada = seleccionarCuenta("Indique el nº de la cuenta a la que quiera hacer el reintegro: ");
        double cantidad = pedirCantidad("Introduzca la cantidad que quiera retirar:", "No se puede hacer un reintegro negativo");
        if (cantidad > cuentaSeleccionada.getSaldo()) {
            System.out.println("Lo sentimos. No dispone de tanto dinero.");
        } else {
            cuentaSeleccionada.setSaldo(cuentaSeleccionada.getSaldo() - cantidad);
            System.out.println("Saldo actual de la cuenta: " + cuentaSeleccionada.getSaldo() + " €");
        }
    }

    // Método que ingresa dinero a una cuenta
    private static void ingresarDinero() {
        Cuenta cuentaSeleccionada = seleccionarCuenta("Indique el nº de la cuenta a la que quiera hacer el ingreso: ");
        double cantidad = pedirCantidad("Introduzca la cantidad que quiera ingresar:", "No se puede hacer ingresos negativos.");
        // Actualizamos saldo
        cuentaSeleccionada.setSaldo(cuentaSeleccionada.getSaldo() + cantidad);
        System.out.println("Saldo actual de la cuenta: " + cuentaSeleccionada.getSaldo() + " €");
    }



    // Método para seleccionar una cuenta, devuelve la referencia a la cuenta seleccionada
    private static Cuenta seleccionarCuenta(String mensaje) {
        System.out.println("Cuentas del sistema:");
        System.out.println(uno);
        System.out.println(dos);
        do {
            int numeroCuenta = pedirEntero(mensaje);
            if (numeroCuenta == uno.getNumeroCuenta()) {
                return uno;
            } else if (numeroCuenta == dos.getNumeroCuenta()) {
                return dos;
            } else {
                System.out.println("Nº de cuenta inexistente.");
            }
        } while (true);
    }

    // Método para seleccionar la cantidad 
    private static double pedirCantidad(String mensaje, String error) {
        double cantidad;
        do {
            cantidad = pedirDoble(mensaje);
            if (cantidad < 0) {
                System.out.println(error);
            }
        } while (cantidad < 0);
        return cantidad;
    }

    private static void menuPrincipal() {
        System.out.println("Bienvenidos al banco de Linkia");
        System.out.println("¿Qué operación quiere realizar?");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Sacar dinero");
        System.out.println("4. Realizar transferencia");
        System.out.println("0. Salir");
    }

}
