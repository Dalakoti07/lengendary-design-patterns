package com.learning.oops.chapter2;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temp,humidity,pressure;

    public CurrentConditionsDisplay(Observable observable){
        observable.AddObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions are  Temperature is "+temp+" humidity is "+humidity+" and pressure is "+pressure);
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
