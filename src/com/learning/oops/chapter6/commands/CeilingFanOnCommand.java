package com.learning.oops.chapter6.commands;

import com.learning.oops.chapter6.appliances.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan fan){
        this.ceilingFan=fan;
    }

    @Override
    public void execute() {
        System.out.println("Turning "+ceilingFan.name+" 's fan on");
        ceilingFan.increaseFanSpeed();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
