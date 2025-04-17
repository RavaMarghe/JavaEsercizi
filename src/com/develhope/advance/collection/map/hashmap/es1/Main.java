/*
 * Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
 * */

package com.develhope.advance.collection.map.hashmap.es1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Inizializzazione con put()
        Map<String, String> capitali = new HashMap<>();

        capitali.put("Italia", "Roma");
        capitali.put("Olanda", "Amsterdam");
        capitali.put("Belgio", "Anversa");

        System.out.println("\n>>> Inizializzazione con put() <<<");
        for (String paese : capitali.keySet()) {
            System.out.println(
                    paese + " --> " + capitali.get(paese)
            );
        }

        // Inizializzazione con Map.of()
        Map<String, Integer> persone = Map.of(
                "Mario", 15,
                "Luigi", 11,
                "Wario", 17
        );

        System.out.println("\n>>> Inizializzazione con Map.of() <<<");
        for (String nome : persone.keySet()) {
            System.out.println(
                    nome + " --> " + persone.get(nome)
            );
        }

        // Inizializzazione con Map.ofEntries()
        Map<String, String> province = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Udine", "UD"),
                new AbstractMap.SimpleEntry<>("Milano", "MI"),
                new AbstractMap.SimpleEntry<>("Torino", "TO")
        );

        System.out.println("\n>>> Inizializzazione con Map.ofEntries() <<<");
        for (String city : province.keySet()) {
            System.out.println(
                    city + " --> " + province.get(city)
            );
        }
    }
}

