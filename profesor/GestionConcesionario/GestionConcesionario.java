/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio03;

import java.io.*;

import actividad04_0485.ejercicio03.pideDatos.Pregunta;
import actividad04_0485.ejercicio03.vehiculos.*;

/**
 *
 * @author Cristian
 */
public class GestionConcesionario {
    private static IAlquilable[] alquilados;

    public static void main(String[] args) throws IOException {
        Seguro seguro01 = new Seguro("Super Seguro", "seguro que te lo cubre todo", 30);
        Seguro seguro02 = new Seguro("Cutri Seguro", "seguro que cubre poquito", 10);
        Seguro[] seguros = { seguro01, seguro02 };


        Coche coche01 = new Coche("KNIGHT", "Coche Fantastico", 4, "B");
        Coche coche02 = new Coche("10CA", "Cochecito Bum Bum", 5, "A");
        Carga furgoneta01 = new Carga("10FF", "Que Furgo!", 7, 50);
        Carga furgoneta02 = new Carga("10FA", "Equipo A", 6, 55);
        Vehiculo[] flota = new Vehiculo[4];
       
       
        flota[0] = coche01;
        flota[1] = coche02;
        flota[2] = furgoneta01;
        flota[3] = furgoneta02;
        

        int opcion;
        do {
            System.out.println("\n Qué quieres hacer?");
            System.out.println("1	Mostrar la información de la flota\n"
                    + "2	Mostrar la información de los seguros.\n"
                    + "3	Reiniciar el alquiler indicando el total de vehículos y seguros que se quiere alquilar.\n"
                    + "4	Establecer el número de días del alquiler..\n" + "5	Mostrar el alquiler.\n" + "0	Fin");

            opcion = Pregunta.pideValorMinMax(0, 5);

            switch (opcion) {
                case 1:
                    muestraFlota(flota);
                    break;
                case 2:
                    muestraSeguros(seguros);
                    break;
                case 3:
                    reiniciarAlquiler(flota, seguros);

                    break;
                case 4:
                    setDiasAlquiler();
                    break;
                case 5:
                    muestraAlquiler();
                    break;
                case 0:
                    System.out.println("Adios");
                    break;

            }

        } while (opcion != 0);

    }

    /** 1 Mostrar la información de la flota. */
    public static void muestraFlota(Vehiculo[] flota) {
        System.out.println("\n --- Nuestra flota de vehiculos disponible ----");
        for (int k = 0; k < flota.length; k++) {
            System.out.println(k + "-" + flota[k]);
        }
    }

    /**
     * 2 Mostrar la información de los seguros disponibles.
     * 
     */
    public static void muestraSeguros(Seguro[] seguros) {
        System.out.println("\n --- Nuestros seguros disponibles ----");
        for (int k = 0; k < seguros.length; k++) {
            System.out.println(k + "-" + seguros[k]);
        }
    }

    /**
     * 3 Reiniciar el alquiler indicando el total de vehículos y seguros que se
     * quiere alquilar (entre 1 y 5) . Esta poción debe pedir al usuario cuántos
     * vehículos y/o seguros quiere alquilar e iniciar de nuevo un array de nombre
     * “alquiler” que permita almacenar tantos vehículos y seguros como los
     * indicados por el usuario. Posteriormente debe mostrar por pantalla las
     * siguientes opciones hasta llenar todo el array de “alquiler”: i. Añade un
     * seguro al alquiler. Debe mostrar todos los seguros al usuario y pedir cual
     * quiere añadir. ii. Añade un vehículo al alquiler Debe mostrar todos los
     * vehiculos al usuario y pedir cual quiere añadir.
     */
    public static void reiniciarAlquiler(Vehiculo[] flota, Seguro[] seguros) {
        int totalAlquilables = Pregunta.pideValorMinMax(1, 5, "Cuantos vehículos o seguros quieres alquilar?");
        alquilados = new IAlquilable[totalAlquilables];
        int totalAlquilados = 0;
        do {
            int opcion = Pregunta.pideValorMinMax(1, 2,
                    "Proceso de alquier. Alquilando el " + (totalAlquilados+1) + " seguro o coche de " + totalAlquilables
                            + " :" + "\n 1- Añadir un vehiculo al alquier" + "\n 2- Añadir un seguro al alquiler");
            switch (opcion) {
                case 1:
                    // Añade un vehículo al alquiler
                    // Debe mostrar todos los vehiculos al usuario y pedir cual quiere añadir.
                    muestraFlota(flota);
                    int numeroVehiculo = Pregunta.pideValorMinMax(0, flota.length,
                            "Indica el número de vehiculo a añadir:");
                    alquilados[totalAlquilados] = flota[numeroVehiculo];
                    break;
                case 2:

                    // Añade un seguro al alquiler.
                    // Debe mostrar todos los seguros al usuario y pedir cual quiere añadir.
                    muestraSeguros(seguros);
                    int numeroSeguro = Pregunta.pideValorMinMax(0, seguros.length,
                            "Indica el número de seguro a añadir:");

                    alquilados[totalAlquilados] = flota[numeroSeguro];
                    break;
            }
            totalAlquilados++;

        } while (totalAlquilados != totalAlquilables);

    }

    /**
     * 4 Establecer el número de días del alquiler. Esta opción debe pedir al
     * usuario un número entre 1 y 30 y establecer ése número de días de alquiler
     * para todos los elementos del array “alquiler”
     * 
     */
    public static void setDiasAlquiler() {
        int diasAlquiler = Pregunta.pideValorMinMax(1, 31, "Cuantos dias dura el alquiler?");
        for (int k = 0; k < alquilados.length; k++) {
            alquilados[k].setNumeroDias(diasAlquiler);
        }
        System.out.println(" Gracias");
    }

    /**
     * 5 Mostrar la información del alquiler
     * 
     */
    public static void muestraAlquiler() {
        System.out.println("\n --- El alquiler actual: ----");
        for (int k = 0; k < alquilados.length; k++) {
            System.out.println(k + "-" + alquilados[k]);
        }
    }
}
