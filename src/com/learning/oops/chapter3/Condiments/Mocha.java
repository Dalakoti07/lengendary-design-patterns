package com.learning.oops.chapter3.Condiments;

import com.learning.oops.chapter3.beverages.Beverage;

public class Mocha extends CondimentsDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
