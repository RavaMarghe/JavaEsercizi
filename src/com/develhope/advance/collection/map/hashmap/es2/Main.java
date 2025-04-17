/*
 * Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
 * */

package com.develhope.advance.collection.map.hashmap.es2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creo l'hashmap
        Map<String, Integer> persone = Map.of(
                "Sheldon", 24,
                "Leonard", 27,
                "Howard", 25
        );

        // Prendo i valori
        Collection<Integer> valori = persone.values();

        // Inserisco i valori in una lista
        List<Integer> listaValori = new ArrayList<>(valori);

        // Ordino i valori
        Collections.sort(listaValori);

        // Stampo i valori
        for (Integer valore : listaValori) {
            System.out.println(valore);
        }
    }
}
