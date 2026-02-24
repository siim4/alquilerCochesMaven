package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.Date;

public class AlquilerCochesDAO {

    private ArrayList<Reserva> reservas = null;

    public AlquilerCochesDAO() {
        this.reservas = new ArrayList<>();

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

    this.reservas.add(reserva1);
    this.reservas.add(reserva2);
    this.reservas.add(reserva3);
    this.reservas.add(reserva4);


    }

    public Reserva getReservaRandom() {
        int posicion = (int) (Math.random() * reservas.size());
        return reservas.get(posicion);
    }

    public Reserva getReservabyId(String id) {

        for (Reserva r : reservas) {
            if (r.getCodigoReserva().equals(id)) {
                return r;
            }

        }
        return null;
    }

    public ArrayList<Reserva> getAllReserva() {
        return this.reservas;
    }

   public static void mostrarDatos(Cliente cliente1, Coche coche1, Reserva reserva1, Garaje garaje1) {
        
        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("Coche: " + coche1.getModelo());
        System.out.println("Reserva: " + reserva1.getCodigoReserva());
        System.out.println("Garaje: " + garaje1.getDireccion());
    }
        


    public static Cliente crearCliente() {
        return new Cliente("C002", "48056723X", "Edu Vargas", "Calle del Peru", "667027925");
    }

   
}