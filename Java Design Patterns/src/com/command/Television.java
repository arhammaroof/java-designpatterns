package com.command;

public class Television implements ElectronicDevice {
    private int volume = 0;

    public void on() {

        System.out.println("TV is on");

    }

    public void off() {

        System.out.println("TV is off");

    }

}
