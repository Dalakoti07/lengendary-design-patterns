package com.learning.oops.chapter2.observer;

import com.learning.oops.chapter2.observable.Observable;

public class StatisticsDisplay implements DisplayElement,Observer {
    private float temp,humidity,pressure;

    public StatisticsDisplay(Observable observable){
        observable.AddObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Max Temperature is "+temp+" / max humidity is "+humidity+" / max pressure is "+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void unsubscribe(Observable observable) {
        observable.RemoveObserver(this);
    }
}
