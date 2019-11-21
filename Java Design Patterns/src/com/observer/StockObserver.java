package com.observer;

//concrete observer
public class StockObserver implements ObserverInterface {
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIdTracker = 0;
    private int observerId;
    private SubjectInterface stockGrabber;

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
