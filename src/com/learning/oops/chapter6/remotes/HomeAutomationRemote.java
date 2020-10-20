package com.learning.oops.chapter6.remotes;

import com.learning.oops.chapter6.commands.Command;
import com.learning.oops.chapter6.commands.NoCommand;

public class HomeAutomationRemote {
    Command lastCommand;
    Command[] onCommands;
    Command[] offCommands;
    public HomeAutomationRemote(){
        onCommands= new Command[7];
        offCommands= new Command[7];

        Command noCommand=new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        lastCommand=noCommand;
    }

    public void setCommand(Command onCommand,Command offCommand,int idx){
        onCommands[idx]=onCommand;
        offCommands[idx]=offCommand;
    }

    public void onButtonWasPressed(int idx){
        System.out.println();
//        System.out.println("........................................................");
        onCommands[idx].execute();
        lastCommand=onCommands[idx];
    }

    public void offButtonPressed(int idx){
        System.out.println();
        offCommands[idx].execute();
        lastCommand=offCommands[idx];
    }

    public void undoButtonPressed(){
        System.out.println("Undo button is pressed ............ ");
        lastCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "]"  + onCommands[i].getClass().getName() + "" + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
