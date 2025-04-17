/*
 * Scrivi un programma che permetta di capire, tramite l'implementazione di due metodi, se un numero è pari o dispari.
 * */

package com.develhope.basics.operatori.logici;

public class PariDispari {
    public static void main(String[] args) {
        int num = 12;

        System.out.println("Il numero inserito è " + num);

        // controllo se il numero è pari o dispari, richiamando i rispettivi metodi
        if (numeroPari(num)) {
            System.out.println("Il numero inserito è pari");
        } else if (numeroDispari(num)) {
            System.out.println("Il numero inserito è dispari");
        }
    }

    // controllo se il numero è pari
    public static boolean numeroPari(int num) {
        return num % 2 == 0;
    }

    // controllo se il numero è dispari
    public static boolean numeroDispari(int num) {
        return num % 2 != 0;
    }
}
