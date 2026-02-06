package org.palomafp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

    @Test
    void mainShouldRunWithoutThrowing() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
