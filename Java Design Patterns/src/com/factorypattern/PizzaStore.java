package com.factorypattern;

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
