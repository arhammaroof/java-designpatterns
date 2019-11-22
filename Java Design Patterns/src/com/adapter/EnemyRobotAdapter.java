package com.adapter;

/**
 * Adapter! class that implements the Enemy interface and integrates the adaptee with the interface
 */
public class EnemyRobotAdapter implements EnemyAttacker {
    /**
     * object of the adaptee
     */
    EnemyRobot theRobot;

    /**
     * An adaptee's object need to be passed in the constructor to set it in the existing adaptee's object;
     * @param newRobot Adaptee class's object
     */
    public EnemyRobotAdapter(EnemyRobot newRobot){

        theRobot = newRobot;

    }

    /**
     * adaptee's method i.e smashWithHands() being called using the required interface method i.e fireWeapon()
     */
    public void fireWeapon() {

        theRobot.smashWithHands();

    }

    /**
     * adaptee's method i.e walkForward() being called using the required interface method i.e driveForward()
     */
    public void driveForward() {

        theRobot.walkForward();

    }

    /**
     * adaptee's method i.e reactToHuman() being called using the required interface method i.e assignDriver()
     */
    public void assignDriver(String driverName) {

        theRobot.reactToHuman(driverName);

    }

}
