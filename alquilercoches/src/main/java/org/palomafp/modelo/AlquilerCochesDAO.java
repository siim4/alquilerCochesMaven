package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que simula todos los datos de las reservas de coches, clientes, garajes y coches.
* @@author Eduardo Vargas y Sima
*/
public class AlquilerCochesDAO {

    /**
     * Lista de reservas de coches
     */
    private ArrayList<Reserva> reservas = null;

    /**
     * Constructor de AlquilerCochesDAO que inicializa datos para las reservas, cliente, garaje y coches
     */
    public AlquilerCochesDAO() {

        this.reservas = new ArrayList<>();
         // se crea una instancia de cliente, garaje, coche y reserva 
        Cliente cliente1 = new Cliente("C001", "12345678A", "Juan Pérez", "Calle Falsa 123", "600123456");
        Garaje garaje1 = new Garaje("G001", "Avenida Principal 456");
        Coche coche1 = new Coche("1234ABC", "Modelo X", "Rojo", "Marca Y", garaje1);
        Reserva reserva1 = new Reserva("R001", new Date(), new Date(), 100.0, cliente1, coche1);
 
    
    Cliente cliente2 = new Cliente("C002", "87654321B", "María López", "Calle Luna 45", "611222333");
    Garaje garaje2 = new Garaje("G002", "Calle Sol 99");
    Coche coche2 = new Coche("5678DEF", "Modelo Z", "Azul", "Marca K", garaje2);
    Reserva reserva2 = new Reserva("R002", new Date(), new Date(), 150.0, cliente2, coche2);

    
    Cliente cliente3 = new Cliente("C003", "11223344C", "Carlos Ruiz", "Avenida Norte 10", "622333444");
    Garaje garaje3 = new Garaje("G003", "Paseo Central 78");
    Coche coche3 = new Coche("9101GHI", "Modelo A", "Negro", "Marca T", garaje3);
    Reserva reserva3 = new Reserva("R003", new Date(), new Date(), 200.0, cliente3, coche3);


    Cliente cliente4 = new Cliente("C004", "55667788D", "Laura Martín", "Calle Sur 22", "633444555");
    Garaje garaje4 = new Garaje("G004", "Boulevard Este 55");
    Coche coche4 = new Coche("1213JKL", "Modelo B", "Blanco", "Marca H", garaje4);
    Reserva reserva4 = new Reserva("R004", new Date(), new Date(), 180.0, cliente4, coche4);

    // se añaden las reservas a la lista de reservas
    this.reservas.add(reserva1);
    this.reservas.add(reserva2);
    this.reservas.add(reserva3);
    this.reservas.add(reserva4);


    }

    /**
     * Metodo que devuelve una reserva aleatoria de la lista de reservas
     * @return una posicion aleatoria de la lista de reservas
     */
    public Reserva getReservaRandom() {
        int posicion = (int) (Math.random() * reservas.size());
        return reservas.get(posicion);
    }

    /**
     * Metodo que devuelve una reserva en funcion del codigo de reserva
     * @param id codigo de reserva que se va a buscar en la lista de reservas
     * @return la reserva que coincide la devuelve, sino devuelve null
     */
    public Reserva getReservabyId(String id) {

        for (Reserva r : reservas) {
            if (r.getCodigoReserva().equals(id)) {
                return r;
            }

        }
        return null;
    }

    /**
     * Metodo que devuelve la lista de reservas
     * @return todas las reservas 
     */

    public ArrayList<Reserva> getAllReserva() {
        return this.reservas;
    } 
}