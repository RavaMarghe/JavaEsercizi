/*
 * Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
 * In questa classe avere i metodi pubblici per ottenere le informazioni.
 * Creare un ArrayList con 12 elementi e stamparlo in console.
 * Mettere in ordine la collezione e stampare il risultato
 * */

package com.develhope.advance.collection.list.arraylist.es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            System.out.print("Inserisci il nome dello studente: ");
            String name = scanner.nextLine();

            System.out.print("Inserisci l'età dell'utente: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consuma il "\n" del nextInt()

            Student student = new Student(name, age);

            students.add(student);
        }

        System.out.println("\n>>> Lista studenti default <<<");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort(Comparator.comparing(Student::getName).thenComparingInt(Student::getAge));

        System.out.println("\n>>> Lista studenti ordinata <<<");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
