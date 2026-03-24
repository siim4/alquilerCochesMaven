package org.palomafp;

import java.util.Scanner;

import org.palomafp.modelo.AlquilerCochesDAO;
import org.palomafp.modelo.Reserva;
import org.palomafp.modelo.Cliente;
import org.palomafp.modelo.Coche;

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
            System.out.println("4.Crear una nueva reserva");
            System.out.println("5.Borrar una reserva");

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

                case 4:
                    System.out.println("Introduce el código de la nueva reserva");
                    String codReserva = sc.next();
                    System.out.println("Introduce el código del cliente");
                    String codCliente = sc.next();
                    System.out.println("Introduce el precio de la reserva");
                    double precioReserva = sc.nextDouble();
                    
                    // Buscar el cliente en todas las reservas existentes
                    Cliente clienteEncontrado = null;
                    for (Reserva r : dao.getAllReserva()) {
                        if (r.getCliente() != null && r.getCliente().getCodigoCliente().equals(codCliente)) {
                            clienteEncontrado = r.getCliente();
                            break;
                        }
                    }
                    
                    Coche cocheEncontrado = null;
                    for (Reserva r : dao.getAllReserva()) {
                        if (r.getCoche() != null) {
                            cocheEncontrado = r.getCoche();
                            break;
                        }
                    }
                    
                    if (clienteEncontrado != null && cocheEncontrado != null) {
                        boolean creada = dao.crearReserva(codReserva, new java.util.Date(), new java.util.Date(), precioReserva, clienteEncontrado, cocheEncontrado);
                        if (creada) {
                            System.out.println("Reserva creada exitosamente");
                        } else {
                            System.out.println("error tt  ese código de reserva ya existe");
                        }
                    } else {
                        System.out.println("error no se ha encontrado el cliente o coche");
                    }
                    break;

                case 5:
                    System.out.println("Introduce el código de la reserva a borrar");
                    String codReservaBorrar = sc.next();
                    boolean borrada = dao.borrarReserva(codReservaBorrar);
                    if (borrada) {
                        System.out.println("Reserva borrada exitosamente");
                    } else {
                        System.out.println(" No se ha encontrado  la reserva con código " + codReservaBorrar);
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
