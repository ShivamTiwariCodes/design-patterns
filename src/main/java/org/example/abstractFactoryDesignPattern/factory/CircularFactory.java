package org.example.abstractFactoryDesignPattern.factory;

import org.example.abstractFactoryDesignPattern.threeDShapes.Sphere;
import org.example.abstractFactoryDesignPattern.threeDShapes.ThreeDShapes;
import org.example.factoryDesignPattern.shapes.Circle;
import org.example.factoryDesignPattern.shapes.Shape;

public class CircularFactory implements DesignFactory{
    @Override
    public Shape create2D() {
        return new Circle();
    }

    @Override
    public ThreeDShapes create3D() {
        return new Sphere();
    }
}
