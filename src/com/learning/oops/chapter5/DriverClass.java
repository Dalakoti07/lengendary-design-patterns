package com.learning.oops.chapter5;

public class DriverClass {

    public static void main(String[] args) {
        ChocolateBoiler boiler= ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.drain();
    }
}
