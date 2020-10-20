package com.learning.oops.chapter6.commands;

import com.learning.oops.chapter6.appliances.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor door){
        this.garageDoor=door;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
        garageDoor.doorDown();
    }

    @Override
    public void undo() {

    }
}
