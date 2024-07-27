package org.example.abstractFactoryDesignPattern.factory;

import org.example.abstractFactoryDesignPattern.threeDShapes.Cube;
import org.example.abstractFactoryDesignPattern.threeDShapes.ThreeDShapes;
import org.example.factoryDesignPattern.shapes.Shape;
import org.example.factoryDesignPattern.shapes.Square;

public class LinearFactory implements DesignFactory{
    @Override
    public Shape create2D() {
        return new Square();
    }

    @Override
    public ThreeDShapes create3D() {
        return new Cube();
    }
}
