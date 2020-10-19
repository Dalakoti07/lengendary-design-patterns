package com.learning.oops.chapter2.observable;

import com.learning.oops.chapter2.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Observable {
    ArrayList<Observer> allObservers= new ArrayList<>();
    private float temp,humidity,pressure;

    @Override
    public void AddObserver(Observer observer) {
        allObservers.add(observer);
    }

    @Override
    public void RemoveObserver(Observer observer) {
        int idx=allObservers.indexOf(observer);
        if(idx>=0){
            allObservers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:allObservers){
            observer.update(this.temp,this.humidity,this.pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
