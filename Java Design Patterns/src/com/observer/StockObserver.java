package com.observer;

/**
 * Concrete Observer
 * uses update method to determine the changes in Subject and update accordingly
 * uses Subject Interface object to register the observers
 */
public class StockObserver implements ObserverInterface {
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIdTracker = 0;
    private int observerId;
    /**
     * Subject Interface object
     */
    private SubjectInterface stockGrabber;

    /**
     * uses this method to register Observers
     * @param stockGrabber sets the subject object sent by the client
     */
    public StockObserver(SubjectInterface stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New Observer "+ this.observerId);
        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerId+"\nIBM: " + ibmPrice + "\nAPPLE: " + aaplPrice + "\nGOOGLE: " + googPrice + "\n"  );
    }
}
