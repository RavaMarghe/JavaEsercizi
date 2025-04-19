/*
 * Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
 * Formatta la data ottenendo 01 marzo 2023
 * Stampa sulla console
 * Fai attenzione a usare almeno Java 8
 * Crea dei test per questo esercizio
 * */

package com.develhope.advance.test.es3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


public class DateFormatter {
    public static void main(String[] args) {
        System.out.println(dateFormatter("2023-03-01T13:00:00Z"));
    }

    // Funzione che formatta la stringa della data
    public static String dateFormatter(String date){
        OffsetDateTime givenDate = OffsetDateTime.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return givenDate.format(formatter);
    }
}
