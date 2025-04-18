/*
 * Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
 *
 * Formatta la data ottenendo 01 marzo 2023
 *
 * Stampa sulla console
 * */

package com.develhope.advance.date.es2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Converto la stringa in OffsetDateTime
        OffsetDateTime givenDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Creo il formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        // Formatto la data
        String formattedDate = givenDate.format(formatter);

        System.out.println("\n" + formattedDate);

    }
}
