/*
 * Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica
 * il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
 * Nel caso non riesca a87 identificare il tipo di operazione dovrà restituire una stringa di errore.
 * */

package com.develhope.basics.condizioni;

public class OperatoriAlgebrici {
    public static void main(String[] args) {
        char operatore = '*';

        // Chiamo il metodo
        String nomeOperatore = identificaOperatoreAlgebrico(operatore);
        System.out.println("L'operatore inserito è un operatore di: " + nomeOperatore);
    }

    // metodo per identificare il tipo di operazione algebrica
    public static String identificaOperatoreAlgebrico(char operatore) {
        return switch (operatore) {
            case '+' -> "addizione";
            case '-' -> "sottrazione";
            case '*' -> "moltiplicazione";
            case '/' -> "divisione";
            default -> "[Input non valido, inserisci uno di questi operatori: '+', '-', '*', '/']";
        };
    }
}
