package com.learning.oops.chapter2;

public interface Observable {
    void AddObserver(Observer observer);
    void RemoveObserver(Observer observer);
    void notifyObservers();
}

