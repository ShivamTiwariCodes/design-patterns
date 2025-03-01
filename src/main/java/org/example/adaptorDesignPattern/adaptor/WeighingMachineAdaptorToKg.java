package org.example.adaptorDesignPattern.adaptor;

import org.example.adaptorDesignPattern.adaptee.WeighingMachine;

public class WeighingMachineAdaptorToKg implements WeighingMachineAdaptor{

    public WeighingMachine weighingMachine;

    public WeighingMachineAdaptorToKg(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        return 0.45*weighingMachine.getWeightInPound();
    }
}
