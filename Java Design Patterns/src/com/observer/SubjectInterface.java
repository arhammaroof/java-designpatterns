package com.observer;

public interface SubjectInterface {
    public void register(ObserverInterface observer);
    public void unregister(ObserverInterface observer);
    public void notifyObserver();

}
