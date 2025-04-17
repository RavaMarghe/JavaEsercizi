/*
 * Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e
 * che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
 * */

package com.develhope.basics.array;

public class SommaArray {
    public static void main(String[] args) {
        sommaArray();
    }

    // Metodo per sommare i numeri dell' array
    public static void sommaArray() {
        int[] listaNumeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somma = 0;

        for (int numero : listaNumeri) {
            somma += numero;
        }
        System.out.println(somma);
    }
}
