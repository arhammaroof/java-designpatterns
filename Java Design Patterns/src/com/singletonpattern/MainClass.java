package com.singletonpattern;

import com.abstractFactory.ChicagoStylePizzaStore;
import com.abstractFactory.NyStylePizzaStore;
import com.factorypattern.PizzaStore;
import com.factorypattern.SimplePizzaFactory;


public class MainClass {
    public static void main(String args[])
    {

        //Singleton

//        Singleton obj;
//        obj=Singleton.getInstance();
//        Singleton obj2;
//        obj2=Singleton.getInstance();
//
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        // Abstract Factory.

//        PizzaStore nyStore = new NyStylePizzaStore();
//        nyStore.orderPizza("cheese");
//        PizzaStore ChicStore = new ChicagoStylePizzaStore();
//        ChicStore.orderPizza("veggie");

        //Simple factory Pattern

        SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStore ps = new PizzaStore(spf);
        ps.orderPizza("cheese");
    }
}

