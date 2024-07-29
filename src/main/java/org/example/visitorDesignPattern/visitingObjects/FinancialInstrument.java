package org.example.visitorDesignPattern.visitingObjects;

import org.example.visitorDesignPattern.visitors.IFinancialVisitor;

public interface FinancialInstrument {
    void accept(IFinancialVisitor financialVisitor);
}
