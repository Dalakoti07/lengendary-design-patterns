package com.learning.oops.chapter6;

import com.learning.oops.chapter6.appliances.CeilingFan;
import com.learning.oops.chapter6.appliances.GarageDoor;
import com.learning.oops.chapter6.appliances.Light;
import com.learning.oops.chapter6.commands.*;
import com.learning.oops.chapter6.remotes.HomeAutomationRemote;

public class HomeAutomationDriver {
    public static void main(String[] args) {
        HomeAutomationRemote homeAutomationRemote= new HomeAutomationRemote();

        // dinning room 's light
        Light light= new Light("Dinning Room Light");
        Command lightOnCommand= new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        homeAutomationRemote.setCommand(lightOnCommand,lightOffCommand,0);

        //kitchen room's light
        Light lightKitchen= new Light("Kitchen Room Light");
        Command lightOnCommand2= new LightOnCommand(lightKitchen);
        Command lightOffCommand2 = new LightOffCommand(lightKitchen);
        homeAutomationRemote.setCommand(lightOnCommand2,lightOffCommand2,1);

        //ceiling fan
        CeilingFan ceilingFan= new CeilingFan("Dining Ceiling fan");
        Command fanOnCommand= new CeilingFanOnCommand(ceilingFan);
        Command fanOffCommand= new CeilingFanOffCommand(ceilingFan);
        homeAutomationRemote.setCommand(fanOnCommand,fanOffCommand,2);

        //garage
        Light garageLight = new Light("Garage Light");
        GarageDoor garageDoor= new GarageDoor("Audi Garage",garageLight);
        Command garageOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageClose = new GarageDoorCloseCommand(garageDoor);
        homeAutomationRemote.setCommand(garageOpen,garageClose,3);

        //stereo later
        // its okay


        System.out.println("Remote is "+homeAutomationRemote);
        homeAutomationRemote.onButtonWasPressed(0);
        homeAutomationRemote.onButtonWasPressed(1);
        homeAutomationRemote.undoButtonPressed();
        homeAutomationRemote.onButtonWasPressed(1);
        homeAutomationRemote.onButtonWasPressed(2);
        homeAutomationRemote.onButtonWasPressed(3);

        homeAutomationRemote.offButtonPressed(0);
        homeAutomationRemote.offButtonPressed(3);
        homeAutomationRemote.offButtonPressed(2);
    }
}
