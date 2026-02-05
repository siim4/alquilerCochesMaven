package org.palomafp;

import java.util.Date;

import org.palomafp.modelo.Cliente;
import org.palomafp.modelo.Coche;
import org.palomafp.modelo.Garaje;
import org.palomafp.modelo.Reserva;

/**
 * Hello world!
 *
 */
public class App {

    Cliente cliente1 = new Cliente("C001", "12345678A", "Juan Pérez", "Calle Falsa 123", "600123456");
    Coche coche1 = new Coche("1234ABC", "Modelo X", "Rojo", "Marca Y", null);
    Reserva reserva1 = new Reserva("R001", new Date(), new Date(), 100.0, cliente1, coche1);
    Garaje garaje1 = new Garaje("G001", "Avenida Principal 456");
    public static void main(String[] args) {
        App app = new App();
        System.out.println("Cliente: " + app.cliente1.getNombre());
        System.out.println("Coche: " + app.coche1.getModelo());
        System.out.println("Reserva: " + app.reserva1.getCodigoReserva());
        System.out.println("Garaje: " + app.garaje1.getDireccion());
    }
}

