package com.learning.oops.chapter8;

public class DrinkBeverage {
    public static void main(String[] args) {
        Coffee coffee= new Coffee();
        System.out.println("Preparing coffee .....");
        coffee.prepareRecipe();

        Tea tea= new Tea();
        System.out.println("Preparing tea .......");
        tea.prepareRecipe();
    }
}

