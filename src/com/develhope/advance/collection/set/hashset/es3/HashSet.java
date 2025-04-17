package com.develhope.advance.collection.set.hashset.es3;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    // Funzione che restituisce un hashset riempito
    public static Set<Integer> creaSet() {
        Set<Integer> numeri = new java.util.HashSet<>();

        numeri.add(23);
        numeri.add(84);
        numeri.add(76);

        return numeri;
    }

    // Funzione che verifica se l'elemento è contenuto nel set e lo rimuove
    public static Set<Integer> rimuoviElemento(Set<Integer> set, Integer numero) {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer nextNumero = iterator.next();
            if (nextNumero.equals(numero)) {
                iterator.remove();
            }
        }
        return set;
    }
}