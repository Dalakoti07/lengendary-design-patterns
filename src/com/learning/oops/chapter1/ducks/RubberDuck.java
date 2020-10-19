package com.learning.oops.chapter1.ducks;

import com.learning.oops.chapter1.duckBehaviour.FlyBehaviour;
import com.learning.oops.chapter1.duckBehaviour.FlyNoWay;
import com.learning.oops.chapter1.duckBehaviour.MuteQuack;
import com.learning.oops.chapter1.duckBehaviour.QuackBehaviour;

public class RubberDuck extends Duck {
    public RubberDuck(){
        // overriding var in super
        flyBehaviour=new FlyNoWay();
        quackBehaviour= new MuteQuack();
    }

    @Override
    void swim() {
        super.swim();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("I am Rubber Duck");
    }

    @Override
    public void setFlyBehaviour(FlyBehaviour behaviour) {
        super.setFlyBehaviour(behaviour);
        flyBehaviour=behaviour;
    }

    @Override
    public void setQuackBehaviour(QuackBehaviour behaviour) {
        super.setQuackBehaviour(behaviour);
        quackBehaviour=behaviour;
    }

    @Override
    public void performFly() {
        flyBehaviour.fly();
    }

    @Override
    public void performQuack() {
        quackBehaviour.quack();
    }
}
