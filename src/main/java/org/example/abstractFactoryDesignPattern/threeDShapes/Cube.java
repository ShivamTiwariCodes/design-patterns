package org.example.abstractFactoryDesignPattern.threeDShapes;

public class Cube implements ThreeDShapes{
    @Override
    public void build() {
        System.out.println("Cube is build.");
    }
}
