package com.learning.oops.chapter1;

public class SuperDuck extends Duck {
    public SuperDuck(){
        // overriding var in super
        flyBehaviour=new FlyWithWing();
        quackBehaviour= new Quack();
    }

    @Override
    void swim() {
        super.swim();
    }

    @Override
    void display() {
        super.display();
        System.out.println("I am Super Duck");
    }

    @Override
    void setFlyBehaviour(FlyBehaviour behaviour) {
        super.setFlyBehaviour(behaviour);
        flyBehaviour=behaviour;
    }

    @Override
    void setQuackBehaviour(QuackBehaviour behaviour) {
        super.setQuackBehaviour(behaviour);
        quackBehaviour=behaviour;
    }

    @Override
    void performFly() {
        flyBehaviour.fly();
    }

    @Override
    void performQuack() {
        quackBehaviour.quack();
    }
}
