/*
 * Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
 *
 * Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi
 * sul risultato del confronto.
 *
 * Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder
 * */

package com.develhope.basics.oop.stringbuilder;

public class ComparaStringhe {
    public static void main(String[] args) {
        System.out.println(comparaStringhe("Hello World", "Hello World"));
        System.out.println(comparaStringhe("Hello World", "Ciao Mondo"));
        System.out.println(comparaStringhe("Hello World", "hello world"));
    }

    public static String comparaStringhe(String stringa1, String stringa2) {
        StringBuilder risultato = new StringBuilder();

        if (stringa1.compareTo(stringa2) == 0) {
            risultato.append("Le due stringhe sono uguali");
        } else {
            risultato.append("Le due stringhe sono differenti");
        }

        return risultato.toString();
    }
}
