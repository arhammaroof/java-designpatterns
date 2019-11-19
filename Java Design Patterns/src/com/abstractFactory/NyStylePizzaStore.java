package com.abstractFactory;

public class NyStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NyCheesePizza();
        } else if(type.equals("pepperoni")){
            pizza = new NyPepperoniPizza();
        } else if(type.equals("veggie")){
            pizza = new NyVeggiePizza();
        }
        return pizza;
    }
}
