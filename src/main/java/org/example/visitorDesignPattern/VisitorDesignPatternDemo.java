package org.example.visitorDesignPattern;

import org.example.visitorDesignPattern.visitingObjects.Bond;
import org.example.visitorDesignPattern.visitingObjects.FinancialInstrument;
import org.example.visitorDesignPattern.visitingObjects.Options;
import org.example.visitorDesignPattern.visitingObjects.Stock;
import org.example.visitorDesignPattern.visitors.IFinancialVisitor;
import org.example.visitorDesignPattern.visitors.PricingVisitor;
import org.example.visitorDesignPattern.visitors.RiskAssesmentVisitor;


//separate algorithms from the objects on which they operate.
//It allows you to add further operations to objects without modifying them,
//thus adhering to the open/closed principle.
public class VisitorDesignPatternDemo {

    public void run() {

        IFinancialVisitor priceVisitor = new PricingVisitor();
        IFinancialVisitor riskAssesmentVisitor = new RiskAssesmentVisitor();

        FinancialInstrument[] financialInstruments = new FinancialInstrument[] {
                new Bond("Bond-issuer", 10),
                new Stock("Stock-1", 20),
                new Options("Option-type-1", 30)
        };


        for(FinancialInstrument financialInstrument: financialInstruments) {
            financialInstrument.accept(priceVisitor);
        }

        for(FinancialInstrument financialInstrument: financialInstruments) {
            financialInstrument.accept(riskAssesmentVisitor);
        }

    }
}
