package org.palomafp.modelo;

import java.util.Date;

public class AlquilerCochesDAO {

    public static void mostrarDatos() {
        Cliente cliente1 = new Cliente("C001", "12345678A", "Juan Pérez", "Calle Falsa 123", "600123456");
        Coche coche1 = new Coche("1234ABC", "Modelo X", "Rojo", "Marca Y", null);
        Reserva reserva1 = new Reserva("R001", new Date(), new Date(), 100.0, cliente1, coche1);
        Garaje garaje1 = new Garaje("G001", "Avenida Principal 456");
        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("Coche: " + coche1.getModelo());
        System.out.println("Reserva: " + reserva1.getCodigoReserva());
        System.out.println("Garaje: " + garaje1.getDireccion());
    }
}