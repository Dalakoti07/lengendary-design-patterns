package com.learning.oops.chapter6.commands;

import com.learning.oops.chapter6.appliances.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan){
        this.fan=fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
}
