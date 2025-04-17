/*
 * Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
 * Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.
 * */

package com.develhope.basics.operatori.comparazione;

public class ConfrontoCaratteri {
    public static void main(String[] args) {
        char cahr1 = 'D';
        char char2 = 'K';

        // chiamo il metodo
        boolean areEquals = areEquals(cahr1, char2);

        System.out.println("First character: " + cahr1);
        System.out.println("Second character: " + char2);
        System.out.println("Are these characters equals? " + areEquals);
    }

    // metodo per controllare se i caratteri sono uguali
    public static boolean areEquals(char a, char b) {
        // effettuo il controllo
        return a == b;
    }
}