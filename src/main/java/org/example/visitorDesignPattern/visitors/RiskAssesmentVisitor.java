package org.example.visitorDesignPattern.visitors;

import org.example.visitorDesignPattern.visitingObjects.Bond;
import org.example.visitorDesignPattern.visitingObjects.Options;
import org.example.visitorDesignPattern.visitingObjects.Stock;

public class RiskAssesmentVisitor implements IFinancialVisitor{
    @Override
    public void visit(Stock stock) {
        System.out.println("Assessing risk for stock : " + stock.getSymbol());
    }

    @Override
    public void visit(Bond bond) {
        System.out.println("Assessing risk for bond : " + bond.getIssuer());
    }

    @Override
    public void visit(Options options) {
        System.out.println("Assessing risk for options : " + options.getOptionType());
    }
}
