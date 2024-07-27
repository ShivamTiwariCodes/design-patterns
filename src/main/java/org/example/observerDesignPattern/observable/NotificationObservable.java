package org.example.observerDesignPattern.observable;

import org.example.observerDesignPattern.observer.Observer;

import java.util.List;

public interface NotificationObservable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void addStock(int count);


}
