package org.example.iteratorDesignPattern.iterator;

import org.example.facadeDesignPattern.Projector;
import org.example.iteratorDesignPattern.Profile;

public interface Iterator {
    boolean hasNext();
    Profile next();
}
