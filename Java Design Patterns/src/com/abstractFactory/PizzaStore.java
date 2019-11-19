package com.abstractFactory;

public abstract class PizzaStore {
    //SimplePizzaFactory factory;
//    public PizzaStore(SimplePizzaFactory factory){
//        //this.factory=factory;
//    }
    public void orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.Prepare();
        pizza.Bake();
        pizza.Box();
        pizza.make();

    }
    public abstract Pizza createPizza(String type);
}
