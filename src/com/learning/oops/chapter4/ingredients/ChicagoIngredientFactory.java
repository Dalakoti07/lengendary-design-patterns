package com.learning.oops.chapter4.ingredients;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Utils.Dough createDough() {
        return new Utils.ThickCrustDough();
    }

    @Override
    public Utils.Sauce createSauce() {
        return new Utils.PlumeTomatoSauce();
    }

    @Override
    public Utils.Cheese createCheese() {
        return new Utils.Mozzarella();
    }

    @Override
    public Utils.Veggies[] createVeggies() {
        Utils.Veggies veggies[] = { new Utils.Spinach(), new Utils.BlackOliver(), new Utils.EggPlant()};
        return veggies;
    }

    @Override
    public Utils.Pepperoni createPepperoni() {
        return new Utils.SlicedPepperoni();
    }

    @Override
    public Utils.Clams createClam() {
        return new Utils.FrozenClams();
    }
}
