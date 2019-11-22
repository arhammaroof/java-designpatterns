package com.observer;

/**
 * This is an interface for observer class
 * defines a method to call when the Subject State changes - update()
 */
public interface ObserverInterface {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
