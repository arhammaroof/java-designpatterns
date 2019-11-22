package com.adapter;
import java.util.Random;

/**
 * Enemy class which does not implement the Enemy interface
 * Adaptee!! a class which needs to integrate with the existing interface
 */
public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");

    }

    public void walkForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");

    }

    public void reactToHuman(String driverName) {

        System.out.println("Enemy Robot Tramps on " + driverName);

    }

}
