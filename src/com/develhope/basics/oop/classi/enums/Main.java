 /*
  * Scrivere un programma che contenga una classe chiamata Forma e un metodo chiamato calcolaArea() che stampi
  * l'area della forma specifica.
  * Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne identifichi
  * la Forma in maniera univoca usando una enum.
  * */


 package com.develhope.basics.oop.classi.enums;

 public class Main {
     public static void main(String[] args) {
         Rettangolo rettangolo = new Rettangolo(5, 2);
         Triangolo triangolo = new Triangolo(6, 3);

         rettangolo.calcoloArea();
         triangolo.calcoloArea();
     }
 }