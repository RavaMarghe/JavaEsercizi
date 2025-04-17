/*
 * Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca
 * la tabellina aritmetica di quel numero che dovrà essere stampata a video.
 * */

package com.develhope.basics.cicli;

public class TabellinaAritmetica {
    public static void main(String[] args) {
        int numero = 3;

        calcoloTabellinaAritmetica(numero);
    }


    // Metodo per calcolare la tabellina aritmetica del valore inserito
    public static void calcoloTabellinaAritmetica(int numero) {
        System.out.println("\n>>> Tabellina del numero " + numero + " <<<");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}