package com.factorypattern;

/**
 * uses a Factory object to create products
 * and the use the product to call the methods required
 * This is a client for the Factory
 */
public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory=factory;
    }
    public void orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.Prepare();
        pizza.Bake();
        pizza.Box();
        pizza.make();

    }
}
