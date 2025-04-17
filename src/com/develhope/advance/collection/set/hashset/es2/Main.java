/*
 * Scrivere una funzione che restituisca un HashSet riempito
 * Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
 * Verificare che l' elemento sia parte del Set e stampare il risultato
 * */

package com.develhope.advance.collection.set.hashset.es2;

import java.util.Set;

import static com.develhope.advance.collection.set.hashset.es2.HashSet.myHashSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeri = myHashSet();

        numeri.add(73);
        numeri.add(97);

        System.out.println(
                numeri.contains(73) + "\n" + numeri.contains(13)
        );
    }
}
