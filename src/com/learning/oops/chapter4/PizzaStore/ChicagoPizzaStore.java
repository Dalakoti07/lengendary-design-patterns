package com.learning.oops.chapter4.PizzaStore;

import com.learning.oops.chapter4.pizza.ChicagoStyleCheesePizza;
import com.learning.oops.chapter4.pizza.ChicagoStyleVeggiePizza;
import com.learning.oops.chapter4.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
