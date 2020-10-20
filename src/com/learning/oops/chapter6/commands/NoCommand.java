package com.learning.oops.chapter6.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command is set");
    }

    @Override
    public void undo() {

    }
}
