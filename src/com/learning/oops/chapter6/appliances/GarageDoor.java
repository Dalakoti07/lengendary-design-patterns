package com.learning.oops.chapter6.appliances;

public class GarageDoor extends Appliance {
    Light light;
    public void doorUp(){
        System.out.println("Garage door is opened");
    }

    public void doorDown(){
        System.out.println("Garage door is closed");
    }

    public void stop(){
        System.out.println("Garage door is stopped !!!");
    }

    public void lightOn(){
        light.On();
    }

    public void lightOff(){
        light.Off();
    }

    public GarageDoor(String name,Light light){
        this.name=name;
        this.light=light;
    }
}
