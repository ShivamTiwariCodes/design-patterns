package org.example.abstractFactoryDesignPattern.factory;

import org.example.abstractFactoryDesignPattern.threeDShapes.ThreeDShapes;
import org.example.factoryDesignPattern.shapes.Shape;

public interface DesignFactory {
    Shape create2D();
    ThreeDShapes create3D();
}
