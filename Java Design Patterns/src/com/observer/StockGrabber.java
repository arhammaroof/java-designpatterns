package com.observer;

import java.util.ArrayList;

/**
 * Concrete Subject class
 * when a change is made(in this case setStockPrice methods) the notifyObserver() method is called which calls the update() method of the observer to update the current changes
 */
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
    /**
     * finds the index of the observer that needs to be removed
     * removes the observer
     */
    public void unregister(ObserverInterface deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1)+ " deleted");
        observers.remove(observerIndex);
    }

    @Override
    /**
     * calls the update method for all the users
     */
    public void notifyObserver() {
        for(ObserverInterface observer: observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    /**
     * when there is a new stock Price
     * each subject is notified
     */
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
