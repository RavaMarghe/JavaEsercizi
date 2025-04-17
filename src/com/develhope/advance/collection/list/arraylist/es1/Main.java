/*
 * Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
 * In questa classe avere i metodi pubblici per ottenere le informazioni.
 * Creare un ArrayList con n elementi e stamparlo in console.
 * Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 * */

package com.develhope.advance.collection.list.arraylist.es1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student alberto = new Student("Alberto", 13);
        Student gigi = new Student("Gigi", 14);
        Student camilla = new Student("Camilla", 15);
        Student marta = new Student("Marta", 13);
        Student alessio = new Student("Alessio", 14);

        List<Student> students = new ArrayList<>();

        students.add(alberto);
        students.add(gigi);
        students.add(camilla);

        for (Student student : students) {
            System.out.println(student);
        }
        students.add(marta);
        students.add(alessio);

        System.out.println("\nArrayList aggiornata: ");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
