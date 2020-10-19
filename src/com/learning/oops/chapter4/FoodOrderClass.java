package com.learning.oops.chapter4;

import com.learning.oops.chapter4.PizzaStore.ChicagoPizzaStore;
import com.learning.oops.chapter4.PizzaStore.NYPizzaStore;
import com.learning.oops.chapter4.PizzaStore.PizzaStore;
import com.learning.oops.chapter4.pizza.Pizza;

public class FoodOrderClass {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore =new NYPizzaStore();
        PizzaStore chicagoPizzaStore= new ChicagoPizzaStore();

        Pizza pizza= nyPizzaStore.orderPizza("cheese");
        System.out.println("Pizza ordered by nitin :"+pizza.getName()+"\n");

        pizza= chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Pizza ordered by nikhil :"+pizza.getName()+"\n");
    }
}
