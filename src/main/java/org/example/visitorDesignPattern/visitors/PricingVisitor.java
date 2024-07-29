package org.example.visitorDesignPattern.visitors;

import org.example.visitorDesignPattern.visitingObjects.Bond;
import org.example.visitorDesignPattern.visitingObjects.Options;
import org.example.visitorDesignPattern.visitingObjects.Stock;

public class PricingVisitor implements IFinancialVisitor{
    @Override
    public void visit(Stock stock) {
        System.out.println("Calculating price for stock : " + stock.getPrice());
    }

    @Override
    public void visit(Bond bond) {
        System.out.println("Calculating price for bond : " + bond.getFaceValue());
    }

    @Override
    public void visit(Options options) {
        System.out.println("Calculating price for options : " + options.getStrikePrice());
    }
}
