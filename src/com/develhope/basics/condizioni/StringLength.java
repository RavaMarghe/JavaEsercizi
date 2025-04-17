/*
 * Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza
 * stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".
 * */

package com.develhope.basics.condizioni;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Nuovo oggetto Scanner
        System.out.print("Inserisci una stringa di testo: "); // Prompt per l'utente

        String myString = scanner.nextLine(); // Leggo l'input dell'utente
        System.out.println("Hai scritto: " + myString);

        if (myString.length() == 10) {
            System.out.println("Lunghezza pari a 10");
        } else if (myString.length() < 10) {
            System.out.println("Lunghezza minore di 10");
        } else {
            System.out.println("Lunghezza maggiore di 10");
        }

        scanner.close();
    }
}