package com.learning.oops.chapter3.Condiments;

import com.learning.oops.chapter3.beverages.Beverage;

public abstract class CondimentsDecorator extends Beverage {
    // First, we need le with a Beverage, interchangeab the Beverage class.
    // because decorator need to be of same type it is wrapping, thus decorators are also of beverage type

    public abstract String getDescription();
}
