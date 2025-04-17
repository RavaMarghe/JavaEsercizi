/*
 * Scrivere una funzione che restituisca un hashset riempito
 * Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
 * Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
 * Svuotare l'hashset, verificarlo e stampare il risultato
 * */

package com.develhope.advance.collection.set.hashset.es3;

import java.util.Set;

import static com.develhope.advance.collection.set.hashset.es3.HashSet.creaSet;
import static com.develhope.advance.collection.set.hashset.es3.HashSet.rimuoviElemento;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeri = creaSet();
        System.out.println(
                "\nSet originale: " + numeri + "\n" +
                        "Dopo aver rimosso l'elemento: " + rimuoviElemento(numeri, 23)
        );

        // Svuoto l'hashset e verifico
        numeri.clear();
        System.out.println("\nIl set è vuoto? " + numeri.isEmpty());

    }
}
