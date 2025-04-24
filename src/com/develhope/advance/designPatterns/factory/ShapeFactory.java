package com.develhope.advance.designPatterns.factory;

public class ShapeFactory {
    public static Shape createShape(ShapeType type) {
        switch (type) {
            case TRIANGLE:
                return new Triangle();
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
            default:
                throw new IllegalArgumentException("Invalid shape: " + type);
        }

    }
}
