/*
 * Dichiarare 2 caratteri e stampare come risultato la combinazione dei due caratteri,
 * affinché siano una stringa priva di spazi.
 * */

package com.develhope.basics.tipi;

public class CharConcat {
    public static void main(String[] args) {
        char char1 = 'a';
        char char2 = 'b';
        String charConcat = "" + char1 + char2;

        System.out.println("Caratteri concatenati: " + charConcat);
    }
}