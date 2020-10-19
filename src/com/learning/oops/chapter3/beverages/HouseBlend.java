package com.learning.oops.chapter3.beverages;

import com.learning.oops.chapter3.beverages.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="House Blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
