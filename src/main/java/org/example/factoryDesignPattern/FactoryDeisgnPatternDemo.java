package org.example.factoryDesignPattern;

import org.example.factoryDesignPattern.shapes.Shape;

public class FactoryDeisgnPatternDemo {

    public void run() {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape square  = shapeFactory.getShape("square");
        square.draw();
    }
}
