package org.palomafp.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class AlquilerCochesDAOTest {
 

   

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

