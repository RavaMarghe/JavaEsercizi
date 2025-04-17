/*
 * Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa
 * tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.
 * */

package com.develhope.basics.cicli;

public class LoopWithContinue {
    public static void main(String[] args) {
        loopWithContinue(13);
    }

    // Metodo per stampare i numeri da 0 a ${numeroMassimo} che salta il numero 5
    public static void loopWithContinue(int numero) {
        // Ciclo for per stampare i numeri da 0 a ${numeroMassimo}
        for (int i = 0; i <= numero; i++) {
            // If statement per saltare il ciclo quando i == 5
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

    }
}
