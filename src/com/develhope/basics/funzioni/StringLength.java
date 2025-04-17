/*
 * Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza
 * */

package com.develhope.basics.funzioni;

public class StringLength {
    public static void main(String[] args) {
        String txt = "Hello World";
        int length = stringLength(txt);

        System.out.println("La lunghezza della stringa è: " + length);
    }

    // ritorna la lunghezza della stringa
    public static int stringLength(String txt) {
        return txt.length();
    }
}