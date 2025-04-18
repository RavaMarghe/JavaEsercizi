/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
 * Verificare che la prima data è precedente alla seconda
 * Verificare che la seconda data è successiva alla prima
 * Verificare che le due date sono uguali a ora
 * Stampa il risultato
 * */

package com.develhope.advance.date.es5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean firstBeforeSecond = date1.isBefore(date2);

        boolean secondAfterFirst = date2.isAfter(date1);

        boolean date1EqualNow = date1.isEqual(OffsetDateTime.now());

        boolean date2EqualNow = date2.isEqual(OffsetDateTime.now());

        boolean areEquals = date1.equals(date2);

        System.out.println(
                "\nLa prima data è precedente alla seconda? " + firstBeforeSecond + "\n" +
                        "La seconda data è successiva alla prima? " + secondAfterFirst + "\n" +
                        "La prima data è uguale ad ora? " + date1EqualNow + "\n" +
                        "La seconda data è uguale ad ora? " + date2EqualNow + "\n" +
                        "Le due date sono uguali? " + areEquals

        );
    }
}
