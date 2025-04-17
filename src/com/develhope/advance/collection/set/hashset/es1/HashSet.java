/*
 * Scrivere una funzione che restituisca un hashset riempito.
 * Leggere l'hashSet e stampare grandezza ed elementi.
 * */

package com.develhope.advance.collection.set.hashset.es1;

import java.util.Set;

public class HashSet {
    // Funzione che crea e riempie l'HashSet
    public static Set<Integer> myHashSet() {
        Set<Integer> numeri = new java.util.HashSet<>();

        numeri.add(5);
        numeri.add(7);
        numeri.add(2);

        return numeri;
    }

    public static void main(String[] args) {
        Set<Integer> numeri = myHashSet();

        // Stampo la grandezza dell'HashSet
        System.out.println("\nGrandezza dell'HashSet: " + numeri.size());

        // Leggo gli elementi dell'HashSet
        for (Integer numero : numeri) {
            System.out.println(numero);
        }
    }
}