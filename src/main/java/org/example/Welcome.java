package org.example;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Welcome {

    private final LocalDateTime dateTime;

    public Welcome(TimeMaster timeMaster) {
        this.dateTime = timeMaster.getTime();
    }

    public String getMessage() {

        ////////variable qui prendra la valeur du message à afficher ////////
        String message = "";

        ////// variable qui récupère le jour de la semaine///////
        DayOfWeek day = this.dateTime.getDayOfWeek();

        ////// variable qui récupère l'heure du jour //////
        int hour = this.dateTime.getHour();

        ////// du vendredi 18h au lundi 9h = Bon week-end //////////
        if ((day == DayOfWeek.FRIDAY && hour > 18) || (day == DayOfWeek.MONDAY && hour < 9)) {
            message = "Bon week-end";
            //////  du lundi au vendredi //////////
        } else if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
            ///////si entre 9h et 13h = Bonjour////
            if (hour > 9 && hour < 13) {
                message = "Bonjour";
            }
            ///// si entre 13h et 18h = Bon après-midi ///////
            else if (hour > 13 && hour < 18) {
                message = "Bon après-midi";
            }
            ///// si entre 18h et 9h = Bonsoir //////////
            else if (hour > 18 || hour < 9) {
                message = "Bonsoir";
            }

            return message;


        }


        message = "Bon week-end";

        return message;

    }
}
