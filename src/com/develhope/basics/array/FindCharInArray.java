/*
 * Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
 * Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 in caso non ce ne siano.
 * */

package com.develhope.basics.array;

import java.util.Scanner;

public class FindCharInArray {
    public static void main(String[] args) {
        // Gestione input utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa di testo: ");
        String testoInserito = scanner.nextLine();
        scanner.close();

        findChars(testoInserito);
    }

    // Metodo che stampa le occorrenze di 'a' o 0 in caso non ce ne siano
    public static void findChars(String input) {
        char[] listaCaratteri = new char[input.length()];
        input.getChars(0, input.length(), listaCaratteri, 0);

        // Controllo di presenza del carattere
        boolean trovatoCarattere = false;

        // Stampa le occorrenze del carattere 'a'
        for (int i = 0; i < listaCaratteri.length; i++) {
            if (listaCaratteri[i] == 'a') {
                System.out.println("Carattere 'a' in posizione: " + i);
                trovatoCarattere = true;
            }
        }

        // Se 'a' non è presente torna 0
        if (!trovatoCarattere) {
            System.out.println(0);
        }
    }
}