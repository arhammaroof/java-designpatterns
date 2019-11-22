package com.strategy;

/**
 * Concrete class which initializes the object of the behaviour it requires
 */
public class iPhone extends MobilePhones{

    public iPhone(int screensize, int ram, int hardDrive) {
        super(screensize, ram, hardDrive);
        System.out.println("Iphone: ");

        /**
         * initializing the class of the required behaviour
         */
        CameraClick = new iphoneCameraClick();
    }
}

