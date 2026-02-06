package org.palomafp.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GarajeTest {

    @Test
    void testConstructorVacioInicializaLista() {
        Garaje garaje = new Garaje();
        assertNotNull(garaje.getCoches());
        assertTrue(garaje.getCoches().isEmpty());
    }

    @Test
    void testConstructorConParametrosAsignaCamposEInicializaLista() {
        Garaje garaje = new Garaje("G1", "Calle A");
        assertEquals("G1", garaje.getCodigoGaraje());
        assertEquals("Calle A", garaje.getDireccion());
        assertNotNull(garaje.getCoches());
        assertTrue(garaje.getCoches().isEmpty());
    }

    @Test
    void testAddCoche() {
        Garaje garaje = new Garaje();
        Coche coche = new Coche();

        garaje.addCoche(coche);

        assertEquals(1, garaje.getCoches().size());
        assertTrue(garaje.getCoches().contains(coche));
    }

    @Test
    void testGetCoches() {
        Garaje garaje = new Garaje();
        Coche c1 = new Coche();
        Coche c2 = new Coche();

        garaje.addCoche(c1);
        garaje.addCoche(c2);

        List<Coche> coches = garaje.getCoches();
        assertEquals(2, coches.size());
        assertSame(c1, coches.get(0));
        assertSame(c2, coches.get(1));
    }

    @Test
    void testGetCodigoGaraje() {
        Garaje garaje = new Garaje("ABC", "Calle X");
        assertEquals("ABC", garaje.getCodigoGaraje());
    }

    @Test
    void testGetDireccion() {
        Garaje garaje = new Garaje("ABC", "Calle X");
        assertEquals("Calle X", garaje.getDireccion());
    }

    @Test
    void testRemoveCoche() {
        Garaje garaje = new Garaje();
        Coche coche = new Coche();
        garaje.addCoche(coche);

        garaje.removeCoche(coche);

        assertTrue(garaje.getCoches().isEmpty());
        assertFalse(garaje.getCoches().contains(coche));
    }

    @Test
    void testSetCoches() {
        Garaje garaje = new Garaje();
        List<Coche> nuevaLista = new ArrayList<>();
        nuevaLista.add(new Coche());

        garaje.setCoches(nuevaLista);

        assertSame(nuevaLista, garaje.getCoches());
        assertEquals(1, garaje.getCoches().size());
    }

    @Test
    void testSetCodigoGaraje() {
        Garaje garaje = new Garaje();
        garaje.setCodigoGaraje("G-99");
        assertEquals("G-99", garaje.getCodigoGaraje());
    }

    @Test
    void testSetDireccion() {
        Garaje garaje = new Garaje();
        garaje.setDireccion("Av. Principal 123");
        assertEquals("Av. Principal 123", garaje.getDireccion());
    }

    @Test
    void testToString() {
        Garaje garaje = new Garaje("G1", "Calle A");
        String s = garaje.toString();
        assertTrue(s.contains("Garaje{"));
        assertTrue(s.contains("codigoGaraje='G1'"));
        assertTrue(s.contains("direccion='Calle A'"));
    }
}
