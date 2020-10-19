package com.learning.oops.chapter3;

import com.learning.oops.chapter3.Condiments.Mocha;
import com.learning.oops.chapter3.Condiments.Whip;
import com.learning.oops.chapter3.beverages.Beverage;
import com.learning.oops.chapter3.beverages.Espresso;
import com.learning.oops.chapter3.beverages.HouseBlend;

public class StarBucks {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                +  " $" + beverage.cost());


        // making complex beverage
        Beverage beverage1= new HouseBlend();
        // add mocha to it
        beverage1= new Mocha(beverage1);
        // add another mocha to it
        beverage1= new Mocha(beverage1);
        // add whip to ti
        beverage1= new Whip(beverage1);
        System.out.println(beverage1.getDescription()
                +  " $" + beverage1.cost());


    }
}
