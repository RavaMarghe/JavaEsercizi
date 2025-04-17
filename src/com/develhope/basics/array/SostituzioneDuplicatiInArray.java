/*
 * Scrivere un programma che contenga un metodo che permetta di sostituire gli elementi duplicati
 * in un array di interi con il valore -1. L' array ottenuto dovrà essere stampato a video.
 * */

package com.develhope.basics.array;

import java.util.Arrays;

public class SostituzioneDuplicatiInArray {
    public static void main(String[] args) {
        int[] arrayNumerico = {1, 2, 3, 4, 5, 3, 5, 6, 7, 6, 7, 8, 9};
        checkDuplicati(arrayNumerico);
    }

    // Metodo per controllare se ci sono elementi duplicati e sostituirli
    public static void checkDuplicati(int[] arrayNumerico) {
        for (int i = 0; i < arrayNumerico.length; i++) {
            for (int j = i + 1; j < arrayNumerico.length; j++) {
                if (arrayNumerico[i] == arrayNumerico[j]) {
                    arrayNumerico[j] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(arrayNumerico));
    }
}