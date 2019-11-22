package com.strategy;

/**
 * The strategy Pattern is used to change behavior of a class on runtime
 * allows the behaviour of program to change dynamically
 */

/**
 * This is the behavior which can be different based on the object type
 */
public interface CameraClickInterface {
    public String CameraClick();
}

/**
 * Concrete class that implements the behaviour in its own way
 */
class iphoneCameraClick implements CameraClickInterface{
    public String  CameraClick(){
        return "Clicks photo in iphone style";
    }
}

/**
 * Another Concrete class that implements the behaviour in its own way
 */
class SamsungCameraClick implements CameraClickInterface{
    public String CameraClick(){
        return "Clicks photo in Samsung style";
    }
}