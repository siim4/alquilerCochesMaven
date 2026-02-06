package org.palomafp.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CocheTest {

    @Test
    void testGetColor() {
        Coche coche1 = new Coche("8806KYS", "Ibiza", "Rojo", "SEAT", null);
        assertEquals("Rojo", coche1.getColor());
    }

    @Test
    void testGetMarca() {
        Coche coche = new Coche("7312GSA", "Ibiza", "Rojo", "SEAT", null);
        assertEquals("SEAT", coche.getMarca());
    }

    @Test
    void testGetMatricula() {
        Coche coche = new Coche("7853HKD", "Ibiza", "Rojo", "SEAT", null);
        assertEquals("7853HKD", coche.getMatricula());
    }

}
