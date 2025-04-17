/*
 * Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca
 * il nome del giorno della settimana come stringa o una stringa di errore nel caso di valore
 * maggiore di 7 o minore di 1.
 * */

package com.develhope.basics.condizioni;

import java.util.Scanner;

public class GiornoSettimana {
    public static void main(String[] args) {
        // Gestione input utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero da 1 a 7: ");
        int giorno = scanner.nextInt();
        scanner.close(); // Chiusura scanner

        checkGiornoSettimana(giorno);

        scanner.close();
    }

    // Metodo per determinare il giorno della settimana dall'input usando l'operatore switch
    public static void checkGiornoSettimana(int giorno) {
        switch (giorno) {
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Input non valido: inserisci un numero da 1 a 7");
        }
    }
}
