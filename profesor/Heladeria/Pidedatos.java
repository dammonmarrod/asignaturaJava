package actividad04_0485.ejercicio02.pideDatos;

import java.io.*;


public class Pregunta {

    public static int pideEntero(String pregunta) {
        System.out.println(pregunta);
        int num = 0;
        boolean repite = true;
        while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String op = br.readLine();
                num = Integer.parseInt(op);
                repite = false;
            } catch (Exception a) {
                System.out.println("Numero incorrecto, try again");
            }
        }

        return num;
    }

    public static double pideDouble(String pregunta) {

        System.out.println(pregunta);
        double num = 0;
        boolean repite = true;
        while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String op = br.readLine();
                num = Double.parseDouble(op);
                repite = false;
            } catch (Exception e) {
                System.out.println("Numero incorrecto, try again");
            }
        }

        return num;
    }

    /**
     * Pide un valor mediante el metodo pideDouble y controla que el valor este
     * entre los valores
     *
     * @return [] valorMinimo
     * @return [] valorMaximo
     */
    public static double pideValorMinMax(double valorMinimo, double valorMaximo) {
       return pideValorMinMax(valorMinimo, valorMaximo,"Introduce un numero entre "+valorMinimo+" y "+valorMaximo);
    }
    public static double pideValorMinMax(double valorMinimo, double valorMaximo,String pregunta) {
        double valor = 0;
        do {
            valor = pideDouble(pregunta);
            if ((valor < valorMinimo) || (valor > valorMaximo)) {
                System.out.println("El valor  debe ser un valor entre "
                        + valorMinimo + " y " + valorMaximo);
            }
        } while ((valor < valorMinimo) || (valor > valorMaximo));
        return valor;
    }

    /**
     * Pide un valor mediante el metodo pideInt y controla que el valor este
     * entre los valores
     *
     * @return [] valorMinimo
     * @return [] valorMaximo
     */
    public static int pideValorMinMax(int valorMinimo, int valorMaximo) {
      return pideValorMinMax(valorMinimo,valorMaximo,"Introduce el valor entre "+valorMinimo+" y "+valorMaximo);
    }
    public static int pideValorMinMax(int valorMinimo, int valorMaximo, String pregunta) {
        int valor = 0;
        do {
            valor = pideEntero(pregunta);
            if ((valor < valorMinimo) || (valor > valorMaximo)) {
                System.out.println("El valor debe ser un valor entre "
                        + valorMinimo + " y " + valorMaximo);
            }
        } while ((valor < valorMinimo) || (valor > valorMaximo));
        return valor;
    }

    public static String pideString(String txt) {
        System.out.println(txt);
        boolean repeat;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
             repeat = false;
            try {
                return br.readLine();
            } catch (IOException ex) {
                repeat = true;
            }
        } while (repeat);
        return null;
    }

}
