package com.factorypattern;

/**
 * The factory classes decide the object to be created as per the clients request
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
