/*
 * Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice specifico
 * all'interno di una stringa e lo stampi.
 *
 * Il metodo dovrà avere nel costruttore una stringa e una posizione e dovrà restituire il carattere in
 * unicode o una stringa di errore.
 *
 * Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder
 * */

package com.develhope.basics.oop.stringbuilder;

public class Unicode {
    public static void main(String[] args) {
        System.out.println(unicodeCarattere("Hello World", 0));
        System.out.println(unicodeCarattere("Hello World", 10));
        System.out.println(unicodeCarattere("Hello World", 11));
        System.out.println(unicodeCarattere("Hello World", -1));
    }

    // Metodo che torna il carattere indicato in Unicode
    public static String unicodeCarattere(String stringa, int index) {
        StringBuilder risultato = new StringBuilder();

        if (index >= 0 && index < stringa.length()) {
            risultato.append("Il codice Unicode del carattere selezionato è: ");
            risultato.append(stringa.codePointAt(index));
        } else {
            risultato.append("Inserisci un indice valido");
        }

        return risultato.toString();
    }
}