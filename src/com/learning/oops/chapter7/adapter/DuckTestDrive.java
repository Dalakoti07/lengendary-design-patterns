package com.learning.oops.chapter7.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck= new MallardDuck();

        WildTurkey wildTurkey= new WildTurkey();
        Duck turkeyAdapter= new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says ...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The duck says");
        trigeerTheDuck(mallardDuck);

        System.out.println("The adapter duck says(I am turkey in disguise of duck ) says");
        trigeerTheDuck(turkeyAdapter);
    }

    private static void trigeerTheDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
