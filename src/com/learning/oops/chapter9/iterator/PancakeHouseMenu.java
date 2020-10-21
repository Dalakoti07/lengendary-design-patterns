package com.learning.oops.chapter9.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems= new ArrayList<>();
        addItem("A & B's Pancake Breakfast","Pancake with eggs and toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancake with eggs and sausages",false,3.99);
        addItem("Blueberry Pancake Breakfast","Pancake with berry and sausages",true,4.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> getIterator(){
        return menuItems.iterator();
    }

    //other methods here
}
