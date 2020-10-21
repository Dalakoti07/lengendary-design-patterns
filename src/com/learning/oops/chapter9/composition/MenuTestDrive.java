package com.learning.oops.chapter9.composition;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        //pancake menu
        pancakeHouseMenu.add(new MenuItem("A & B's Pancake Breakfast","Pancake with eggs and toast",true,2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancake with eggs and sausages",false,3.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake Breakfast","Pancake with berry and sausages",true,4.99));
        allMenus.add(pancakeHouseMenu);


        dinerMenu.add(new MenuItem("Vegetarian BLT ","Falcon with tomato",true,2.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT 2 ","Falcon with onion",true,2.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT 3","Falcon with carrots",true,2.99));
        dinerMenu.add(new MenuItem("Hot Dog ","Topped with tomato, onion and cheeses",false,2.99));
        allMenus.add(dinerMenu);


        allMenus.add(cafeMenu);


        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

                // add more menu items here
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
