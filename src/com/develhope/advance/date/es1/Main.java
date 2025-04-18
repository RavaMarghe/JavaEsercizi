/*
 * Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
 *
 * Formatta la data ottenuta in FULL, MEDIUM e SHORT
 *
 * Stampa le varie versioni
 * */

package com.develhope.advance.date.es1;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Creo un oggetto OffsetDateTime
        OffsetDateTime givenDate = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        // Formatto OffsetDateTime in ZonedDateTime
        ZonedDateTime zonedDate = givenDate.toZonedDateTime();

        // Formatto la data in FULL
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.getDefault()); // Creo il formatter
        String fullFormat = zonedDate.format(fullFormatter); // Formatto la data

        // Formatto la data in MEDIUM
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String mediumFormat = zonedDate.format(mediumFormatter);

        // Formatto la data in SHORT
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String shortFormat = zonedDate.format(shortFormatter);

        System.out.println(
                "\nFormato FULL: " + fullFormat + "\n" +
                        "Formato MEDIUM: " + mediumFormat + "\n" +
                        "Formato SHORT: " + shortFormat
        );

    }
}
