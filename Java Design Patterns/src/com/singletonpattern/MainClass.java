package com.singletonpattern;

import com.Bridge.RemoteButton;
import com.Bridge.TVDevice;
import com.Bridge.TVRemoteMute;
import com.Bridge.TVRemotePause;
import com.Builder.Account;
import com.abstractFactory.ChicagoStylePizzaStore;
import com.abstractFactory.NyStylePizzaStore;
import com.adapter.EnemyAttacker;
import com.adapter.EnemyRobot;
import com.adapter.EnemyRobotAdapter;
import com.adapter.EnemyTank;
import com.factorypattern.PizzaStore;
import com.factorypattern.SimplePizzaFactory;

import java.util.AbstractCollection;


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

//        SimplePizzaFactory spf = new SimplePizzaFactory();
//        PizzaStore ps = new PizzaStore(spf);
//        ps.orderPizza("cheese");

        // Builder Pattern
//        Account account = new Account.Builder().id(4).email("abc@xyz.com").build();
//        System.out.println(account.getEmail());

        // Bridge Pattern
//        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
//
//        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
//
//
//        System.out.println("Test TV with Mute");
//
//        theTV.buttonFivePressed();
//        theTV.buttonSixPressed();
//        theTV.buttonNinePressed();
//
//        System.out.println("\nTest TV with Pause");
//
//        theTV2.buttonFivePressed();
//        theTV2.buttonSixPressed();
//        theTV2.buttonNinePressed();
//        theTV2.deviceFeedback();

          //Adapter Pattern
        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}


