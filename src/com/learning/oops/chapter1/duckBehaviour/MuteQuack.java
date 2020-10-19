package com.learning.oops.chapter1.duckBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Unable to quack");
    }
}
