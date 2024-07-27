package org.example.factoryDesignPattern;

import org.example.factoryDesignPattern.shapes.Circle;
import org.example.factoryDesignPattern.shapes.Rectangle;
import org.example.factoryDesignPattern.shapes.Shape;
import org.example.factoryDesignPattern.shapes.Square;

public class ShapeFactory {

    public Shape getShape(String shape) {

        switch (shape) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                System.out.println("Please provide the correct shape name. Given name : " + shape);
                return null;
        }
    }
}
