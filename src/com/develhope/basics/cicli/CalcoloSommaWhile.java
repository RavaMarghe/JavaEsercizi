/*
 * Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore intero
 * come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
 * */

package com.develhope.basics.cicli;

public class CalcoloSommaWhile {
    public static void main(String[] args) {
        calcoloSomma(7);
    }

    // Metodo per calcolare la somma dei valori da 1 al limite stabilito
    public static void calcoloSomma(int numero) {
        int somma = 0; // Variabile per accumulare le somme

        // Calcolo della somma con un ciclo while
        while (numero > 0) {
            somma += numero;
            numero--;
        }

        System.out.println("La somma dei valori inferiori al limite inserito è: " + somma);
    }
}
