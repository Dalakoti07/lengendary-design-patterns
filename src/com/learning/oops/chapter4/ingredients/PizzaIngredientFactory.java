package com.learning.oops.chapter4.ingredients;

public interface PizzaIngredientFactory {
    public Utils.Dough createDough();
    public Utils.Sauce createSauce();
    public Utils.Cheese createCheese();
    public Utils.Veggies[] createVeggies();
    public Utils.Pepperoni createPepperoni();
    public Utils.Clams createClam();
}
