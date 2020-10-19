package com.learning.oops.chapter3.beverages;

public abstract class Beverage {
    String description="Unkown beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
