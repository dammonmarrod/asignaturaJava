package actividad04_0485.ejercicio02;

import actividad04_0485.ejercicio02.pideDatos.Pregunta;

public class Heladeria {
    public static void main(String[] args) {
        /*
         * 5• Inicialmente contenga un array de nombre “pedido” con los siguientes
         * valores: o Unos cacahuetes de 99kcal y 1.5€ o Una horchata de 250ml, 20kcal,
         * 30% de chufa y 2.5€. o Un cucurucho de galleta de 20kcal y precio 1€. El
         * cucurucho tiene dos sabores:  de vainilla de 30kcal , 1€ , 15% grasa con
         * azúcar.  de chocolate de 15kcal, 1€ , 15% grasa con aspartamo. o Un
         * cucurucho de galleta de chocolate de 25kcal y precio 1.5€. El cucurucho tiene
         * dos sabores:  de cookies de 35kcal , 1.25€ , 20% grasa con azúcar.  de
         * fresa de 10 kcal, 1€ , 5% grasa con aspartamo.
         * 
         */
        Comida cacahuetes = new Comida("cacahuetes", 1.5, 99);

        Horchata horchata = new Horchata("horchata", 2.5, 20, 250, 30);
        Cucurucho cucurucho1 = new Cucurucho("chocolate", 1, 20, 2);

        SaborHelado sabor1 = new SaborHelado("vainilla", 1, 30, 15, "azúcar");
        SaborHelado sabor2 = new SaborHelado("chocolate", 1, 15, 15, "aspartamo");
        cucurucho1.addBolaHelado(sabor1, 0);
        cucurucho1.addBolaHelado(sabor2, 1);

        Cucurucho cucurucho2 = new Cucurucho("galleta", 1.5, 25, 2);
        cucurucho2.addBolaHelado(new SaborHelado("cookies", 1.25, 35, 20, "azucar"), 0);
        cucurucho2.addBolaHelado(new SaborHelado("fresa", 1, 10, 5, "aspartamo"), 1);

        Comida[] pedido = { cacahuetes, horchata, cucurucho1, cucurucho2 };

        // 6• Muestra la información de todos los productos que forman el “pedido” por
        // consola.
        mostrarPedido(pedido);

        // 7. Muestra un menú al dependiente para que hasta que no elija salir, pueda
        // ver el pedido actual y/o sustituir tantas veces como se desee un elemento del
        // pedido por una horchata con los valores que él indique.
        int operacion;
        do {
            operacion = Pregunta.pideEntero("Quieres hacer alguna otra operación?"
                    + "\n 1-Sustituye un pedido por una orchata" + "\n 2- Ver el pedido actual" + "\n 0- Salir");

            switch (operacion) {
                case 0:

                    break;

                case 1:
                    addHorchata(pedido);
                    break;
                case 2:
                    mostrarPedido(pedido);
                    break;

            }

        } while (operacion != 0);

    }

    public static void mostrarPedido(Comida[] pedido) {
        System.out.println("Información del pedido:");
        for (int k = 0; k < pedido.length; k++) {

            System.out.println(k + "-" + pedido[k]);
        }
    }

    public static void addHorchata(Comida[] pedido) {
        int numProducto = Pregunta.pideValorMinMax(0, pedido.length - 1,
                "Indica el número de producto del pedido a modificar");
        String nombre = Pregunta.pideString("Nombre de la horchata?:");
        double precio = Pregunta.pideDouble("Precio?:");
        double kcal = Pregunta.pideDouble("KCal?:");
        double cantidad = Pregunta.pideDouble("Cantidad de horchata?:");
        double porcentaje_chufa = Pregunta.pideDouble("Qué porcentaje de chufa tiene?:");

        Horchata horchata = new Horchata(nombre, precio, kcal, cantidad, porcentaje_chufa);
        pedido[numProducto] = horchata;
    }
}
