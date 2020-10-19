package com.learning.oops.chapter2.observable;

import com.learning.oops.chapter2.observer.Observer;

public interface Observable {
    void AddObserver(Observer observer);
    void RemoveObserver(Observer observer);
    void notifyObservers();
}

