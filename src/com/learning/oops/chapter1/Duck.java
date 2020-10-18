package com.learning.oops.chapter1;

abstract public class Duck {
    // behavious
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    void swim(){
        System.out.println("Duck swimming");
    }

    void display(){
        System.out.println("Displaying duck name:");
    }

    void setFlyBehaviour(FlyBehaviour behaviour){

    }

    void setQuackBehaviour(QuackBehaviour behaviour){

    }

    void performFly(){
        flyBehaviour.fly();
    }

    void performQuack(){
        quackBehaviour.quack();
    }
}
