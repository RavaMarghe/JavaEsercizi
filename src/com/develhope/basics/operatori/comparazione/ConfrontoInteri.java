/*
 * Scrivi un programma che contiene un metodo che confronti due numeri interi e determini se sono diversi.
 *
 * Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.
 * */

package com.develhope.basics.operatori.comparazione;

public class ConfrontoInteri {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;

        // chiamo il metodo
        boolean areDifferent = areDifferent(num1, num2);

        System.out.println("Are these numbers different? " + areDifferent);
    }

    // metodo booleano per controllare la disuguaglianza
    public static boolean areDifferent(int a, int b) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // effettuo il controllo
        return a != b;
    }
}