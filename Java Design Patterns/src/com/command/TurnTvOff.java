package com.command;

public class TurnTvOff implements Command{
    ElectronicDevice theDevice;

    public TurnTvOff(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.off();

    }
}
