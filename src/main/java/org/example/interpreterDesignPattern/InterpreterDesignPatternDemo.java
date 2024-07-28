package org.example.interpreterDesignPattern;

import org.example.interpreterDesignPattern.expression.Expression;
import org.example.interpreterDesignPattern.expression.MultiplyExpression;
import org.example.interpreterDesignPattern.expression.NumberExpression;
import org.example.interpreterDesignPattern.expression.SumExpression;

public class InterpreterDesignPatternDemo {

    public void run() {

        //    2*(5+(3*4)) = 34
        Expression expression = new MultiplyExpression(new NumberExpression(2),
                new SumExpression(new NumberExpression(5),
                        new MultiplyExpression(new NumberExpression(3), new NumberExpression(4))));
        System.out.println("Result of expression is : " + expression.evaluate());

    }

}
