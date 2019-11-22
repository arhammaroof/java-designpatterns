package com.strategy;

/**
 * Class that has all the common features of the concrete classes that are extending from it
 * Behaviour can change according to each concrete class extending the super class
 * contains the interface object that is required to call the methods of the concrete class accordingly
 */
public class MobilePhones {
    int screensize;
    int ram;
    int hardDrive;
    CameraClickInterface CameraClick;


    public MobilePhones(int screensize, int ram, int hardDrive){
        this.hardDrive=hardDrive;
        this.ram=ram;
        this.screensize=screensize;
    }

    public void printConfig(){
        System.out.println("hardDrive: " + hardDrive + " Ram: " + ram + " Screen size: " + screensize);

    }

    /**
     * once the concrete class is instantiated behaviour can be called accordingly
     * @return behaviour of the class
     */
    public String clickPhoto(){
        return CameraClick.CameraClick();
    }
}
