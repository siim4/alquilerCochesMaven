package org.palomafp.modelo;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void testConstructorConParametrosYGetters() {
        Date inicio = new Date(1700000000000L);
        Date fin = new Date(1700086400000L);
        double precio = 123.45;

        Cliente cliente = new Cliente();
        cliente.setNombre("Ana");

        Coche coche = new Coche();
        coche.setMatricula("1234-ABC");

        Reserva reserva = new Reserva("R1", inicio, fin, precio, cliente, coche);

        assertEquals("R1", reserva.getCodigoReserva());
        assertSame(inicio, reserva.getFechaInicio());
        assertSame(fin, reserva.getFechaFin());
        assertEquals(precio, reserva.getPrecio(), 1e-9);
        assertSame(cliente, reserva.getCliente());
        assertSame(coche, reserva.getCoche());
    }

    @Test
    void testGetCliente() {
        Reserva reserva = new Reserva();
        Cliente cliente = new Cliente();
        cliente.setNombre("Pepe");

        reserva.setCliente(cliente);

        assertSame(cliente, reserva.getCliente());
    }

    @Test
    void testGetCoche() {
        Reserva reserva = new Reserva();
        Coche coche = new Coche();
        coche.setMatricula("9999-ZZZ");

        reserva.setCoche(coche);

        assertSame(coche, reserva.getCoche());
    }

    @Test
    void testGetCodigoReserva() {
        Reserva reserva = new Reserva();
        reserva.setCodigoReserva("RX");
        assertEquals("RX", reserva.getCodigoReserva());
    }

    @Test
    void testGetFechaFin() {
        Reserva reserva = new Reserva();
        Date fin = new Date(1700086400000L);
        reserva.setFechaFin(fin);
        assertSame(fin, reserva.getFechaFin());
    }

    @Test
    void testGetFechaInicio() {
        Reserva reserva = new Reserva();
        Date inicio = new Date(1700000000000L);
        reserva.setFechaInicio(inicio);
        assertSame(inicio, reserva.getFechaInicio());
    }

    @Test
    void testGetPrecio() {
        Reserva reserva = new Reserva();
        reserva.setPrecio(50.0);
        assertEquals(50.0, reserva.getPrecio(), 1e-9);
    }

    @Test
    void testSetCliente() {
        Reserva reserva = new Reserva();
        Cliente cliente = new Cliente();
        cliente.setNombre("Laura");

        reserva.setCliente(cliente);

        assertSame(cliente, reserva.getCliente());
    }

    @Test
    void testSetCoche() {
        Reserva reserva = new Reserva();
        Coche coche = new Coche();
        coche.setMatricula("1111-AAA");

        reserva.setCoche(coche);

        assertSame(coche, reserva.getCoche());
    }

    @Test
    void testSetCodigoReserva() {
        Reserva reserva = new Reserva();
        reserva.setCodigoReserva("R-2026");
        assertEquals("R-2026", reserva.getCodigoReserva());
    }

    @Test
    void testSetFechaFin() {
        Reserva reserva = new Reserva();
        Date fin = new Date(1700086400000L);

        reserva.setFechaFin(fin);

        assertSame(fin, reserva.getFechaFin());
    }

    @Test
    void testSetFechaInicio() {
        Reserva reserva = new Reserva();
        Date inicio = new Date(1700000000000L);

        reserva.setFechaInicio(inicio);

        assertSame(inicio, reserva.getFechaInicio());
    }

    @Test
    void testSetPrecio() {
        Reserva reserva = new Reserva();
        reserva.setPrecio(199.99);
        assertEquals(199.99, reserva.getPrecio(), 1e-9);
    }

    @Test
    void testToStringConClienteYCoche() {
        Date inicio = new Date(1700000000000L);
        Date fin = new Date(1700086400000L);

        Cliente cliente = new Cliente();
        cliente.setNombre("Ana");

        Coche coche = new Coche();
        coche.setMatricula("1234-ABC");

        Reserva reserva = new Reserva("R1", inicio, fin, 100.0, cliente, coche);

        String s = reserva.toString();

        assertTrue(s.contains("Reserva{"));
        assertTrue(s.contains("codigoReserva='R1'"));
        assertTrue(s.contains("precio=100.0"));
        assertTrue(s.contains("cliente=Ana"));
        assertTrue(s.contains("coche=1234-ABC"));
        assertTrue(s.contains("fechaInicio="));
        assertTrue(s.contains("fechaFin="));
    }

    @Test
    void testToStringConClienteNullYCocheNull() {
        Date inicio = new Date(1700000000000L);
        Date fin = new Date(1700086400000L);

        Reserva reserva = new Reserva("R2", inicio, fin, 75.0, null, null);

        String s = reserva.toString();

        assertTrue(s.contains("codigoReserva='R2'"));
        assertTrue(s.contains("cliente=null"));
        assertTrue(s.contains("coche=null"));
    }
}
