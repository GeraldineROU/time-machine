package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {

    @Test
    void getMessage() {
        ///// initialisation ////////
        Welcome welcome = new Welcome(LocalDateTime.parse("2024-08-30T15:00:00"));

        //////// éxécution du code à tester ///////////
        String message = welcome.getMessage();

        /////// vérification //////////
        assertEquals("Bon après-midi", message);

    }



}

