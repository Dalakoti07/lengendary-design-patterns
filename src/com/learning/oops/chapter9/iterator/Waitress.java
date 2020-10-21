package com.learning.oops.chapter9.iterator;

import java.util.Iterator;

public class Waitress {
    // we have made iterator for both menu so that waitress can interate over it easily

    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void PrintMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.getIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        PrintMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        PrintMenu(dinerIterator);
    }

    void PrintMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    // other methods
}
