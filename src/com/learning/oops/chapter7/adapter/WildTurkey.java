package com.learning.oops.chapter7.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gooble..");
    }

    @Override
    public void fly() {
        System.out.println("small steps flying ....");
    }
}
