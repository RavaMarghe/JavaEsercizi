/*
 * Scrivere un programma che dato un valore inserito dall'utente o dichiarato in una variabile,
 * utilizzi un metodo che per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli
 * di 5 stampi "Buzz". Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
 * */

package com.develhope.basics.condizioni;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // creo un nuovo oggetto Scanner

        System.out.print("Inserisci un numero: "); // prompt per l'utente
        int userInput = scanner.nextInt(); // leggo l'input dell'utente e lo salvo nella variabile 'userInput'

        System.out.println("Hai inserito il numero: " + userInput);

        if (multiploDiTre(userInput) && multiploDiCinque(userInput)) {
            System.out.println("FizzBuzz");
        } else if (multiploDiTre(userInput)) {
            System.out.println("Fizz");
        } else if (multiploDiCinque(userInput)) {
            System.out.println("Buzz");
        } else {
            System.out.println("Il numero inserito non è multiplo di 3 o di 5");
        }

        scanner.close();
    }

    // controllo se il numero inserito è multiplo di 3
    public static boolean multiploDiTre(int num) {
        return num % 3 == 0;
    }

    // controllo se il numero inserito è multiplo di 5
    public static boolean multiploDiCinque(int num) {
        return num % 5 == 0;
    }

}