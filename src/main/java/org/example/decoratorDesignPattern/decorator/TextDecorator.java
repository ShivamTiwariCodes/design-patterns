package org.example.decoratorDesignPattern.decorator;

import org.example.decoratorDesignPattern.base.TextComponent;

public abstract class TextDecorator implements TextComponent {
    @Override
    abstract public String format();
}
