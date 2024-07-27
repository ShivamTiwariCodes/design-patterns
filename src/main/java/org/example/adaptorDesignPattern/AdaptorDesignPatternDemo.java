package org.example.adaptorDesignPattern;

import org.example.adaptorDesignPattern.adaptee.WeighingMachine;
import org.example.adaptorDesignPattern.adaptee.WeighingMachineForBabies;
import org.example.adaptorDesignPattern.adaptor.WeighingMachineAdaptor;
import org.example.adaptorDesignPattern.adaptor.WeighingMachineAdaptorToKg;

public class AdaptorDesignPatternDemo {

    public void run() {
        WeighingMachine weighingMachine = new WeighingMachineForBabies();
        WeighingMachineAdaptor weighingMachineAdaptor = new WeighingMachineAdaptorToKg(weighingMachine);

        System.out.println("Weight in pound : " + weighingMachine.getWeightInPound());
        System.out.println("Weight in kg : " + weighingMachineAdaptor.getWeightInKg());
    }
}
