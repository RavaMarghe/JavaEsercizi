/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * Ottieni l'anno
 * Ottieni il mese
 * Ottieni il giorno
 * Ottieni il giorno della settimana
 * Stampa i risultati sulla console
 * Crea dei test pet questo esercizio
 * */


package com.develhope.advance.test.es4;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class GetDate {
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
