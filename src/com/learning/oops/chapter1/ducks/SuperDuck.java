package com.learning.oops.chapter1.ducks;

import com.learning.oops.chapter1.duckBehaviour.FlyBehaviour;
import com.learning.oops.chapter1.duckBehaviour.FlyWithWing;
import com.learning.oops.chapter1.duckBehaviour.Quack;
import com.learning.oops.chapter1.duckBehaviour.QuackBehaviour;

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
    public void display() {
        super.display();
        System.out.println("I am Super Duck");
    }

    @Override
    public void setFlyBehaviour(FlyBehaviour behaviour) {
        super.setFlyBehaviour(behaviour);
        flyBehaviour=behaviour;
    }

    @Override
    void setQuackBehaviour(QuackBehaviour behaviour) {
        super.setQuackBehaviour(behaviour);
        quackBehaviour=behaviour;
    }

    @Override
    public void performFly() {
        flyBehaviour.fly();
    }

    @Override
    void performQuack() {
        quackBehaviour.quack();
    }
}
