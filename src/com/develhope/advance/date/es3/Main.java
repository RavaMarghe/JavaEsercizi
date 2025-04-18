/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * ottieni l'anno
 * ottieni il mese
 * ottieni il giorno
 * ottieni il giorno della settimana
 * Stampa i risultati sulla console
 * */

package com.develhope.advance.date.es3;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime givenDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = givenDate.getYear();
        int month = givenDate.getMonthValue();
        int day = givenDate.getDayOfMonth();
        DayOfWeek dayOfWeek = givenDate.getDayOfWeek();

        System.out.println(
                "\nYear: " + year + "\n" +
                        "Month: " + month + "\n" +
                        "Day: " + day + "\n" +
                        "Day of week: " + dayOfWeek
        );

    }
}
