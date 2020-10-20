package com.learning.oops.chapter6.appliances;

public class Stereo extends Appliance {
    public void on(){
        System.out.println("stereo is on!");
    }

    public void off(){
        System.out.println("stereo is off!");
    }

    public void setCD(){
        System.out.println("CD is rolling.... and set");
    }

    public void setVolume(int volume){
        System.out.println("Volume is set to "+volume);
    }

    public Stereo(String name){
        this.name=name;
    }
}
