package org.example.decoratorDesignPattern;

import org.example.decoratorDesignPattern.base.PlainText;
import org.example.decoratorDesignPattern.base.TextComponent;
import org.example.decoratorDesignPattern.decorator.BoldTextDecorator;
import org.example.decoratorDesignPattern.decorator.ItalicTextDecorator;
import org.example.decoratorDesignPattern.decorator.UnderlineTextDecorator;

public class DecoratorDesignPatternDemo {

    public void run() {

        TextComponent plainText = new PlainText("This is text.");

        TextComponent boldText = new BoldTextDecorator(plainText);
        System.out.println("This is bold text : " + boldText.format());

        TextComponent boldItalicText = new ItalicTextDecorator(boldText);
        System.out.println("This is bold italic text : " + boldItalicText.format());

        TextComponent boldUnderLineText = new UnderlineTextDecorator(boldText);
        System.out.println("This is bold underline text : " + boldUnderLineText.format());

        TextComponent boldUnderLineItalictext = new UnderlineTextDecorator(boldItalicText);
        System.out.println("This is bold italic underline text : " + boldUnderLineItalictext.format());
    }
}
