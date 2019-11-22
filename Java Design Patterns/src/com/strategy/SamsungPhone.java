package com.strategy;

/**
 * Concrete class which initializes the object of the behaviour it requires
 */
public class SamsungPhone extends MobilePhones {
    public SamsungPhone(int screensize, int ram, int hardDrive) {
        super(screensize, ram, hardDrive);
        System.out.println("Samsung Phone: ");

        /**
         * initializing the class of the required behaviour
         */
        CameraClick = new SamsungCameraClick();
    }
}
