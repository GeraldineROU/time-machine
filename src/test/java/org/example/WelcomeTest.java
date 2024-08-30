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
        TimeMaster timeMaster = new TimeMasterForTests(LocalDateTime.parse("2024-08-30T15:00:00"));
        Welcome welcome = new Welcome(timeMaster);

        //////// éxécution du code à tester ///////////
        String message = welcome.getMessage();

        /////// vérification //////////
        assertEquals("Bon après-midi", message);
    }

    @ParameterizedTest
    @CsvSource({
            "2024-08-30T15:00:00,Bon après-midi",
            "2024-08-30T11:00:00,Bonjour",
            "2024-08-29T21:00:00,Bonsoir",
            "2024-08-30T19:00:00,Bon week-end",
            })
            void getMessage(String date, String expectedMessage) {
        TimeMaster timeMaster = new TimeMasterForTests(LocalDateTime.parse(date));
        Welcome welcome = new Welcome(timeMaster);

        String message = welcome.getMessage();

        assertEquals(expectedMessage, message);
    }



}

