package com.learning.oops.chapter4.pizza;

import com.learning.oops.chapter4.ingredients.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.ingredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        name="Chicago Style Deep Dish Cheese Pizza";
        /*dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";*/
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
//        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
