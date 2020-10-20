package com.learning.oops.chapter6.appliances;

public class CeilingFan extends Appliance{
    int fanSpeed=0;

    public void on(){
        System.out.println(name+"'s fan is on!");
    }

    public void off(){
        System.out.println(name+"'s fan is off!");
    }

    public void increaseFanSpeed(){
        if(fanSpeed<3){
            System.out.println("Increasing fan speed....");
            fanSpeed++;
        }else
            System.out.println("Cannot increase fan speed, already working with full speed");
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public CeilingFan(String name){
        this.name=name;
    }
}
