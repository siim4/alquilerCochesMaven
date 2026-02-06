package org.palomafp.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    void testGetCodigoCliente() {
        Cliente c = AlquilerCochesDAO.crearCliente();
        assertEquals("C002", c.getCodigoCliente(), "El código de cliente tiene k  ser C002");
    }

    @Test
    void testGetDNI() {
        Cliente c = AlquilerCochesDAO.crearCliente();
        assertEquals("48056723X", c.getDNI());
        assertTrue(c.getDNI().length() == 9);
    }

    @Test
    void testGetDireccion() {
        Cliente c = AlquilerCochesDAO.crearCliente();
        assertEquals("Calle del Peru", c.getDireccion());
    }

    @Test
    void testGetNombre() {
        Cliente c = AlquilerCochesDAO.crearCliente();
        assertEquals("Edu Vargas", c.getNombre());
        assertNotNull(c.getNombre());
    }

}
