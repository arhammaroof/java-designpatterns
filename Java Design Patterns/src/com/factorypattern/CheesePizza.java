package com.factorypattern;

/**
 * Concrete Product
 */
public class CheesePizza extends Pizza {
    public CheesePizza(){}
    public void make(){
        System.out.println("Making cheese pizza");
    }
}
