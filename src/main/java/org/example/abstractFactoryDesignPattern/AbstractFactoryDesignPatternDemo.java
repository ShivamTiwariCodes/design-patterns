package org.example.abstractFactoryDesignPattern;

import org.example.abstractFactoryDesignPattern.factory.CircularFactory;
import org.example.abstractFactoryDesignPattern.factory.LinearFactory;
import org.example.abstractFactoryDesignPattern.threeDShapes.ThreeDShapes;
import org.example.factoryDesignPattern.shapes.Shape;

public class AbstractFactoryDesignPatternDemo {


    public void run() {
        CircularFactory circularFactory = new CircularFactory();

        Shape circle = circularFactory.create2D();
        circle.draw();

        ThreeDShapes sphere = circularFactory.create3D();
        sphere.build();

        LinearFactory linearFactory = new LinearFactory();

        Shape square = linearFactory.create2D();
        square.draw();

        ThreeDShapes cube = linearFactory.create3D();
        cube.build();
    }

}
