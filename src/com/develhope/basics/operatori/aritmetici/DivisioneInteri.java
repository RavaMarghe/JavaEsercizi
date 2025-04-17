/*
 * Definisci un metodo per la divisione di 2 numeri interi che restituisca il risultato che dovrà essere stampato.
 * */

package com.develhope.basics.operatori.aritmetici;

public class DivisioneInteri {
    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 12;

        // controllo del divisore per prevenire errori (Arithmetic Exception)
        if (num2 == 0) {
            System.out.println("Il divisore non può essere zero, inserisci un altro numero.");
        } else {
            int risultato = restoDivisione(num1, num2);
            System.out.println("Il resto della divisione è: " + risultato);

        }
    }

    // calcola il risultato della divisione tra due numeri interi
    public static int restoDivisione(int a, int b) {
        return a / b;
    }
}
