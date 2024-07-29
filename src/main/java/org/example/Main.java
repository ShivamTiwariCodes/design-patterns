package org.example;

import org.example.abstractFactoryDesignPattern.AbstractFactoryDesignPatternDemo;
import org.example.adaptorDesignPattern.AdaptorDesignPatternDemo;
import org.example.bridgeDesignPattern.BridgeDesignPatternDemo;
import org.example.builderDesignPattern.BuilderDesignPatternDemo;
import org.example.chainOfResponsibilityDesignPattern.ChainOfResponsibilityDemo;
import org.example.commandDesignPattern.CommandDesignPatternDemo;
import org.example.compositeDesignPattern.CompositeDesignPatternDemo;
import org.example.decoratorDesignPattern.DecoratorDesignPatternDemo;
import org.example.facadeDesignPattern.FacadeDesignPatternDemo;
import org.example.factoryDesignPattern.FactoryDeisgnPatternDemo;
import org.example.flyweightPattern.FlyweightPatternDemo;
import org.example.interpreterDesignPattern.InterpreterDesignPatternDemo;
import org.example.iteratorDesignPattern.IteratorDesignPatternDemo;
import org.example.mediatorDesignPattern.MediatorDesignPatternDemo;
import org.example.momentoDesignPattern.MomentoDesignPatternDemo;
import org.example.nullObjectPattern.NullObjectPatternDemo;
import org.example.observerDesignPattern.ObserverDesignPatternDemo;
import org.example.prototypeDesignPattern.PrototypeDesignPatternDemo;
import org.example.proxyDesignPattern.ProxyPatternDemo;
import org.example.singletonDesignPattern.SingletonDesignPatternDemo;
import org.example.stateDesignPattern.StateDesignPatternDemo;
import org.example.strategyDesignPattern.StrategyPattern;
import org.example.templateMethodPattern.TemplateMethodPatternDemo;
import org.example.visitorDesignPattern.VisitorDesignPatternDemo;

public class Main {
    public static void main(String[] args) {

        final String designPatternName = "AbstractFactoryDesignPatternDemo";

        switch (designPatternName) {
            case "AbstractFactoryDesignPatternDemo":
                new AbstractFactoryDesignPatternDemo().run();
                break;
            case "AdaptorDesignPatternDemo":
                new AdaptorDesignPatternDemo().run();
                break;
            case "BridgeDesignPatternDemo":
                new BridgeDesignPatternDemo().run();
                break;
            case "BuilderDesignPatternDemo":
                new BuilderDesignPatternDemo().run();
                break;
            case "ChainOfResponsibilityDemo":
                new ChainOfResponsibilityDemo().run();
                break;
            case "CommandDesignPatternDemo":
                new CommandDesignPatternDemo().run();
                break;
            case "CompositeDesignPatternDemo":
                new CompositeDesignPatternDemo().run();
                break;
            case "DecoratorDesignPatternDemo":
                new DecoratorDesignPatternDemo().run();
                break;
            case "FacadeDesignPatternDemo":
                new FacadeDesignPatternDemo().run();
                break;
            case "FactoryDeisgnPatternDemo":
                new FactoryDeisgnPatternDemo().run();
                break;
            case "FlyweightPatternDemo":
                new FlyweightPatternDemo().run();
                break;
            case "InterpreterDesignPatternDemo":
                new InterpreterDesignPatternDemo().run();
                break;
            case "IteratorDesignPatternDemo":
                new IteratorDesignPatternDemo().run();
                break;
            case "MediatorDesignPatternDemo":
                new MediatorDesignPatternDemo().run();
                break;
            case "MomentoDesignPatternDemo":
                new MomentoDesignPatternDemo().run();
                break;
            case "NullObjectPatternDemo":
                new NullObjectPatternDemo().run();
                break;
            case "ObserverDesignPatternDemo":
                new ObserverDesignPatternDemo().run();
                break;
            case "PrototypeDesignPatternDemo":
                new PrototypeDesignPatternDemo().run();
                break;
            case "ProxyPatternDemo":
                new ProxyPatternDemo().run();
                break;
            case "SingletonDesignPatternDemo":
                new SingletonDesignPatternDemo().run();
                break;
            case "StateDesignPatternDemo":
                new StateDesignPatternDemo().run();
                break;
            case "StrategyPattern":
                new StrategyPattern().run("bitcoin");
                new StrategyPattern().run("cash");
                break;
            case "TemplateMethodPatternDemo":
                new TemplateMethodPatternDemo().run();
                break;
            case "VisitorDesignPatternDemo":
                new VisitorDesignPatternDemo().run();
                break;
            default:
                System.out.println("Please choose the correct design pattern. Provided is : " + designPatternName);

        }
    }
}