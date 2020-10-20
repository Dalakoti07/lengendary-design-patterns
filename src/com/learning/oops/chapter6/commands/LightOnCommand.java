package com.learning.oops.chapter6.commands;

import com.learning.oops.chapter6.appliances.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.On();
    }

    @Override
    public void undo() {
        light.Off();
    }
}
