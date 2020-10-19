package com.learning.oops.chapter4.PizzaStore;

import com.learning.oops.chapter4.pizza.NYStyleCheesePizza;
import com.learning.oops.chapter4.pizza.NYStyleVeggiePizza;
import com.learning.oops.chapter4.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
