/*
 * Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
 *
 * Il costruttore accetterà un Builder in input
 *
 * Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome,
 * gli altri campi sono opzionali) per costruire l'oggetto Person.
 *
 * Creare due oggetti Person e stamparli a video
 * */

package com.develhope.advance.designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Person sheldon = new PersonBuilder("Sheldon", "Cooper").age(31).address("Pasadena").build();
        Person leonard = new PersonBuilder("Leonard", "Hofstadter").build();

        System.out.println(sheldon);
        System.out.println(leonard);

        System.out.println("\nFirst name: " + sheldon.getFirstName() +
                "\nLastName: " + sheldon.getLastName() +
                "\nAge: " + sheldon.getAge() +
                "\nAddress: " + sheldon.getAddress()
        );

        System.out.println("\nFirst name: " + leonard.getFirstName() +
                "\nLastName: " + leonard.getLastName() +
                "\nAge: " + leonard.getAge() +
                "\nAddress: " + leonard.getAddress()
        );

    }
}
