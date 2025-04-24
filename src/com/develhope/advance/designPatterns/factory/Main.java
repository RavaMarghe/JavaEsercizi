/*
 * Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
 *
 * Crea una enum che abbia tutti i tipi di shape che hai creato (cerchio, rettangolo etc.)
 *
 * Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base al enum in input.
 *
 * Stampa a video il risultato della funzione draw di ogni shape creata
 * */

package com.develhope.advance.designPatterns.factory;

public class Main {
    public static void main(String[] args) {
        Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE);
        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);

        triangle.draw();
        rectangle.draw();
        circle.draw();

    }
}
