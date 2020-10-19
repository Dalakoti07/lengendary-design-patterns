package com.learning.oops.chapter3.Condiments;

import com.learning.oops.chapter3.beverages.Beverage;

public class Whip extends CondimentsDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return  beverage.cost()+0.10;
    }
}