package org.palomafp.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class AlquilerCochesDAOTest {
    @Test
    void testCrearCliente() {

        Cliente cliente = AlquilerCochesDAO.crearCliente();

        assertNotNull(cliente, "El objeto cliente no puede ser nulo");

        assertEquals("Edu Vargas", cliente.getNombre());
        assertEquals("C002", cliente.getCodigoCliente());
        assertEquals("48056723X", cliente.getDNI());

        assertNotNull(cliente.getReservas());
        assertTrue(cliente.getReservas().isEmpty());

    }

    @Test
    void testMostrarDatos() {
        Cliente cliente1 = new Cliente("C001", "12531678D", "Sima", "Calle Francos Rodriguez", "600123456");
        Coche coche1 = new Coche("1234ABC", "ibiza ", "Rojo", "seat", null);
        Reserva reserva1 = new Reserva("R001", new Date(), new Date(), 100.0, cliente1, coche1);
        Garaje garaje1 = new Garaje("G001", "Avenida Francos Rodriguez 106");
        assertEquals(cliente1, reserva1.getCliente(), "La reserva tiene q  pertenecer al cliente1(sima)");
        assertEquals("1234ABC", reserva1.getCoche().getMatricula());

        assertTrue(reserva1.getPrecio() > 0, "El precio de la reserva debe ser positivo, como va a ser negativo bobo");

        assertEquals("G001", garaje1.getCodigoGaraje());
        assertEquals("Avenida Francos Rodriguez 106", garaje1.getDireccion());
    }

}

