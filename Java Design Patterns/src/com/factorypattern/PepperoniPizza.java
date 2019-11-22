package com.factorypattern;

/**
 * Concrete Product
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){}
    public void make(){
        System.out.println("Making pepperoni pizza");
    }
}
