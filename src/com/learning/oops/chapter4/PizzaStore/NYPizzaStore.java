package com.learning.oops.chapter4.PizzaStore;

import com.learning.oops.chapter4.ingredients.ChicagoIngredientFactory;
import com.learning.oops.chapter4.ingredients.NYPizzaIngredientFactory;
import com.learning.oops.chapter4.ingredients.PizzaIngredientFactory;
import com.learning.oops.chapter4.pizza.NYStyleCheesePizza;
import com.learning.oops.chapter4.pizza.NYStyleVeggiePizza;
import com.learning.oops.chapter4.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        NYPizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza(ingredientFactory);
        } else return null;
    }
}
