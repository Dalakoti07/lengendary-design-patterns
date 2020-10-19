package com.learning.oops.chapter2.observer;

import com.learning.oops.chapter2.observable.Observable;

public interface Observer {
    void update(float temp,float humidity,float pressure);

    void unsubscribe(Observable observable);
}
