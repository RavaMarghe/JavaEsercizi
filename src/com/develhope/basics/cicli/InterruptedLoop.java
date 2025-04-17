/*
 * Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti
 * i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
 * */

package com.develhope.basics.cicli;

public class InterruptedLoop {
    public static void main(String[] args) {
        int numeroMassimo = 18;

        interruptedLoop(numeroMassimo);
    }

    // Metodo per stampare i numeri da 0 a ${numeroMassimo} che si interrompe al 5
    public static void interruptedLoop(int numero) {
        // Ciclo for per stampare i numeri da 0 a ${numeroMassimo}
        for (int i = 0; i <= numero; i++) {
            // If statement per interrompere il ciclo quando i == 5
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

    }
}
