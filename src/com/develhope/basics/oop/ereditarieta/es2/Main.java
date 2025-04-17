/*
 * Scrivere un programma che contenga una classe chiamata Forma e un metodo chiamato calcolaArea() che stampi l'area
 * della forma.
 *
 * Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del
 * rettangolo.
 * */

package com.develhope.basics.oop.ereditarieta.es2;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(3.5, 7);

        forma.calcoloArea();
        rettangolo.calcoloArea();
    }
}
