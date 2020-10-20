package com.learning.oops.chapter6.appliances;

public class Light extends Appliance{

    public void Off(){
        System.out.println(name+"'s Light is turned off");
    }

    public void On(){
        System.out.println(name+"'s Light is turned on");
    }

    public Light(String name){
        this.name=name;
    }
}
