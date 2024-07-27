package org.example.decoratorDesignPattern.decorator;

import org.example.decoratorDesignPattern.base.TextComponent;

public class UnderlineTextDecorator extends TextDecorator{

    private TextComponent textComponent;

    public UnderlineTextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String format() {
        return "<u>" + textComponent.format() + "</u>";
    }
}
