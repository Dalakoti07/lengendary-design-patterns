package com.learning.oops.chapter6.commands;

import com.learning.oops.chapter6.appliances.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor door){
        this.garageDoor=door;
    }

    @Override
    public void execute() {
        garageDoor.doorUp();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {

    }
}
