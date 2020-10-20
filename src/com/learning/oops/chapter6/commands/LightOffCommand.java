package com.learning.oops.chapter6.commands;

import com.learning.oops.chapter6.appliances.Light;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.Off();
    }

    @Override
    public void undo() {
        light.On();
    }
}
