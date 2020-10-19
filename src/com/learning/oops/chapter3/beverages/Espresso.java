package com.learning.oops.chapter3.beverages;

import com.learning.oops.chapter3.beverages.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description="Expresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
