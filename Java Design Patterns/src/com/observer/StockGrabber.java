package com.observer;

import java.util.ArrayList;

//concrete Subject
public class StockGrabber implements SubjectInterface {
    private ArrayList<ObserverInterface> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<ObserverInterface>();
    }
    @Override
    public void register(ObserverInterface newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(ObserverInterface deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1)+ " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(ObserverInterface observer: observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIbmPrice(double newIbmPrice){
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }
    public void setAaplPrice(double newAaplPrice){
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }
    public void setGoogPrice(double newGoogPrice){
        this.googPrice= newGoogPrice;
        notifyObserver();
    }
}
