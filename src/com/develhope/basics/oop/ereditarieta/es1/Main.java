/*
 * Scrivere un programma che contenga una classe chiamata Animale e un metodo chiamato faiIlVerso() che stampi
 * il verso dell'animale.
 *
 * Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
 * Prova quindi a far stampare il verso di Animale e di Gatto.
 * */

package com.develhope.basics.oop.ereditarieta.es1;

public class Main {
    public static void main(String[] args) {
        Animale animale = new Animale();
        Gatto gatto = new Gatto();

        animale.faiIlVerso();
        gatto.faiIlVerso();
    }
}
