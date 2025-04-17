/*
 * Creare una classe Fruit che accenti nel costruttore il parametro name (String)
 * In questa classe avere i metodi pubblici per ottenere le informazioni.
 * Creare un LinkedList con elementi e stamparlo in console.
 * Aggiungere un elemento al primo posto della lista e uno all'ultimo
 * Stampare la collezione aggiornata
 * */

package com.develhope.advance.collection.list.linkedlist;

// import java.util.List;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit blueberry = new Fruit("Blueberry");
        Fruit banana = new Fruit("Banana");
        Fruit strawberry = new Fruit("Strawberry");
        Fruit kiwi = new Fruit("Kiwi");
        Fruit peach = new Fruit("Peach");

        // ????? List è sbagliato!? ?????
        LinkedList<Fruit> fruits = new LinkedList<>();

        fruits.add(blueberry);
        fruits.add(banana);
        fruits.add(strawberry);

        System.out.println("\n>>> Lista frutta iniziale <<<");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.addFirst(kiwi);
        fruits.addLast(peach);

        System.out.println("\n>>> Lista frutta aggiornata <<<");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
