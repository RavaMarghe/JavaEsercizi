/*
 * Scrivere una funzione che accetti in input 2 int e ne stampi la somma
 * Scrivere una funzione che accetti in input 1 char lo stampi
 * Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
 * Scrivere una funzione che accetti in input 1 Character lo stampi
 * Scrivere un valore primitivo per int, double e char e fare autoboxing
 * Scrivere un oggetto per Integer, Double e Character e fare Unboxing
 * */

package com.develhope.advance.boxing;

public class AutoboxingUnboxing {
    // Calcolo la somma di due int
    public static void sommaInt(int num1, int num2) {
        System.out.println("Somma (int): " + (num1 + num2));
    }

    // Stampo un carattere char
    public static void stampaChar(char carattere) {
        System.out.println("Char: " + carattere);
    }

    // Calcolo la somma di due Integer
    public static void sommaInteger(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Uno dei due valori è null!");
        } else {
            System.out.println("Somma (Integer): " + (num1 + num2));
        }

    }

    // Stampo un carattere Character
    public static void stampaCharacter(Character carattere) {
        if (carattere == null) {
            System.out.println("Il carattere è null!");
        } else {
            System.out.println("Character: " + carattere);
        }

    }

    public static void main(String[] args) {
        // Funzioni
        sommaInt(4, 3);
        stampaChar('d');
        sommaInteger(5, 6);
        stampaCharacter('f');

        // Autoboxing
        int numeroInt = 13;
        double numeroDouble = 82.75;
        char carattere = 'j';

        Integer boxedInt = numeroInt;
        Double boxedDouble = numeroDouble;
        Character boxedCharacter = carattere;

        System.out.println("Autoboxing: " + boxedInt + ", " + boxedDouble + ", " + boxedCharacter);

        // Unboxing
        Integer oggettoInt = 31;
        Double oggettoDouble = 57.28;
        Character oggettoChar = 'y';

        int unboxedInt = oggettoInt;
        double unboxedDouble = oggettoDouble;
        char unboxedChar = oggettoChar;

        System.out.println("Unboxing: " + unboxedInt + ", " + unboxedDouble + ", " + unboxedChar);

    }
}

