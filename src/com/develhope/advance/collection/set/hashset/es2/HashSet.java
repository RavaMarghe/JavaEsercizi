package com.develhope.advance.collection.set.hashset.es2;

import java.util.Set;

public class HashSet {
    // Funzione che restituisce un HashSet già riempito
    public static Set<Integer> myHashSet() {
        Set<Integer> numeri = new java.util.HashSet<>();

        numeri.add(12);
        numeri.add(3);
        numeri.add(22);

        return numeri;
    }
}
