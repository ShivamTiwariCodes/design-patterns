package org.example.decoratorDesignPattern.decorator;

import org.example.decoratorDesignPattern.base.TextComponent;

public class ItalicTextDecorator extends TextDecorator{

    private TextComponent textComponent;

    public ItalicTextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    public String format() {
        return "<i>" +  textComponent.format() + "</i>";
    }
}
