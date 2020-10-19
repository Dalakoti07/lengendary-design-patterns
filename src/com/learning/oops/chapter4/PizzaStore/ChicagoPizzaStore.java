package com.learning.oops.chapter4.PizzaStore;

import com.learning.oops.chapter4.ingredients.ChicagoIngredientFactory;
import com.learning.oops.chapter4.pizza.ChicagoStyleCheesePizza;
import com.learning.oops.chapter4.pizza.ChicagoStyleVeggiePizza;
import com.learning.oops.chapter4.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        ChicagoIngredientFactory ingredientFactory =
                new ChicagoIngredientFactory();
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza(ingredientFactory);
        } else return null;
    }
}
