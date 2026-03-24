package org.palomafp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test simple de la aplicación
 * @author Eduardo y Sima
 */
class AppTest {

    @Test
    void mainShouldRunWithoutThrowing() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
