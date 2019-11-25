package com.command;

public class TurnTvOn implements Command {
    ElectronicDevice theDevice;

    public TurnTvOn(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.on();

    }
}
