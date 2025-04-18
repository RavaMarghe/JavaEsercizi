/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * aggiungi un anno
 * sottrai un mese
 * aggiungi 7 giorni
 * Stampa il risultato localizzata per l'Italia
 * */

package com.develhope.advance.date.es4;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime givenDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime newDate = givenDate.plusYears(1).minusMonths(1).plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd MMMM yyyy").withLocale(Locale.ITALIAN);

        String formattedDate = newDate.format(formatter);

        System.out.println("\n" + formattedDate);

    }
}
