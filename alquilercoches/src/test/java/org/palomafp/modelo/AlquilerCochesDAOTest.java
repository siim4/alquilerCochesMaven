package org.palomafp.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class AlquilerCochesDAOTest {
 

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

    @Test
    void testGetReservaRandom() {
        AlquilerCochesDAO dao = new AlquilerCochesDAO();
        Reserva reservaRandom = dao.getReservaRandom();

        assertNotNull(reservaRandom, "La reserva aleatoria no puede ser nula");
        assertTrue(reservaRandom instanceof Reserva, "El objeto devuelto debe ser una instancia de Reserva");
    }

    @Test
    void testGetReservabyId() {
        AlquilerCochesDAO dao = new AlquilerCochesDAO();
        Reserva reserva = dao.getReservabyId("R002");

        assertNotNull(reserva, "La reserva con ID R002 no debe ser nula");
        assertEquals("R002", reserva.getCodigoReserva(), "El código de la reserva debe ser R002");
    }

    @Test
    void testGetAllReserva() {
        AlquilerCochesDAO dao = new AlquilerCochesDAO();
        assertNotNull(dao.getAllReserva(), "La lista de reservas no puede ser nula");
        assertTrue(dao.getAllReserva().size() > 0 || !dao.getAllReserva().isEmpty(), "La lista de reservas debe contener al menos una reserva");
    }

}

