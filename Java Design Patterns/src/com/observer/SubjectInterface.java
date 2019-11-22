package com.observer;

/**
 * This is an interface for Concrete Subject class
 * defines methods that helps observer to register, unrigester to the Subject class
 * defines a method that is used to notify the observers when there is a change in Subject
 */
public interface SubjectInterface {
    public void register(ObserverInterface observer);
    public void unregister(ObserverInterface observer);
    public void notifyObserver();

}
