package com.abstractFactory;


    public class ChicagoStylePizzaStore extends PizzaStore {
        public Pizza createPizza(String type) {
            Pizza pizza = null;
            if (type.equals("cheese")) {
                pizza = new ChicCheesePizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicPepperoniPizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicVeggiePizza();
            }
            return pizza;
        }
    }


