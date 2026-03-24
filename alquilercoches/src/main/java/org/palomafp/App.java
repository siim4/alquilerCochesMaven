package org.palomafp;

import java.util.Scanner;

import org.palomafp.modelo.AlquilerCochesDAO;
import org.palomafp.modelo.Reserva;

/**
 * Clase principal que ejecuta el simulamiento de alquiler de coches.
 * 
 * @@author Eduardo Vargas y Sima
 */
public class App {

    /**
     * Metodo main que ejecuta a aplicacion de alquiler de coches mediante un menu
     * 
     * @param args Argumentos
     */
    public static void main(String[] args) {

        // Se crea una instancia de AlquilerCochesDAO para acceder a las reservas
        AlquilerCochesDAO dao = new AlquilerCochesDAO();
        // Se usa Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // variable que sirve para elegir la opcion del menu
        int opcion;
        // variable que sirve para almacenar el codigo de reserva
        String codigo;

        /**
         * Se muestra un menu interactivo con varias opciones
         */

            System.out.println("Menu de alquiler de coches");

        do {

           System.out.println();
            System.out.println("0.Salir");
            System.out.println("1.Mostrar una reserva aleatoria");
            System.out.println("2.Mostrar reserva según el código");
            System.out.println("3.Mostrar todas las reservas");

            try {
                opcion = sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debes introducir un número válido para la opción.");
                sc.nextLine();
                opcion = -1;
                continue;
            }

            switch (opcion) {
                case 0:
                    System.out.println("Saliendooo");
                    break;
                case 1:

                    System.out.println(dao.getReservaRandom());

                    break;

                case 2:
                    System.out.println("Introduce tu codigo de reserva");
                    codigo = sc.next();

                    System.out.println(dao.getReservabyId(codigo));
                    break;

                case 3:

                    for (Reserva r : dao.getAllReserva()) {
                        System.out.println("-------------");
                        System.out.println(r);
                        System.out.println("-------------");
                    }
                    break;

                default:
                    System.err.println("Has introducido una opcion que no existe");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
