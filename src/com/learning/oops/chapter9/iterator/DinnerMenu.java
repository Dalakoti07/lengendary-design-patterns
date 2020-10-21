package com.learning.oops.chapter9.iterator;

import java.util.Iterator;


public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT ","Falcon with tomato",true,2.99);
        addItem("Vegetarian BLT 2 ","Falcon with onion",true,2.99);
        addItem("Vegetarian BLT 3","Falcon with carrots",true,2.99);
        addItem("Hot Dog ","Topped with tomato, onion and cheeses",false,2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can’t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
    //other methods here
}
