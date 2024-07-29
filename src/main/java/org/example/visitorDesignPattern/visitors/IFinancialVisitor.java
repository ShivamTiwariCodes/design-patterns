package org.example.visitorDesignPattern.visitors;

import org.example.visitorDesignPattern.visitingObjects.Bond;
import org.example.visitorDesignPattern.visitingObjects.Options;
import org.example.visitorDesignPattern.visitingObjects.Stock;

import javax.swing.text.html.Option;

public interface IFinancialVisitor {

    void visit(Stock stock);
    void visit(Bond bond);
    void visit(Options options);
}
