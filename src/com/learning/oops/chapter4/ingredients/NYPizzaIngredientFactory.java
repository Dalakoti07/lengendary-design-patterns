package com.learning.oops.chapter4.ingredients;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Utils.Dough createDough() {
        return new Utils.ThinCrustDough();
    }

    @Override
    public Utils.Sauce createSauce() {
        return new Utils.MarinaraSauce();
    }

    @Override
    public Utils.Cheese createCheese() {
        return new Utils.ReggianoCheese();
    }

    @Override
    public Utils.Veggies[] createVeggies() {
        Utils.Veggies veggies[] = { new Utils.Garlic(), new Utils.Onion(), new Utils.Mushroom(), new Utils.RedPepper() };
        return veggies;
    }

    @Override
    public Utils.Pepperoni createPepperoni() {
        return new Utils.SlicedPepperoni();
    }

    @Override
    public Utils.Clams createClam() {
        return new Utils.FreshClams();
    }
}
