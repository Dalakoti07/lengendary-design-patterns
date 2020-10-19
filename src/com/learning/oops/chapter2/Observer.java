package com.learning.oops.chapter2;

public interface Observer {
    void update(float temp,float humidity,float pressure);

    void unsubscribe(Observable observable);
}
