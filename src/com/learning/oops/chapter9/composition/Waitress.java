package com.learning.oops.chapter9.composition;

public class Waitress {
    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        allMenus.print();
    }
}
