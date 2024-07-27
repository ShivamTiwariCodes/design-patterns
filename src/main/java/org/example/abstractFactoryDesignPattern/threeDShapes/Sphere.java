package org.example.abstractFactoryDesignPattern.threeDShapes;

public class Sphere implements ThreeDShapes{

    @Override
    public void build() {
        System.out.println("Sphere is build.");
    }
}
