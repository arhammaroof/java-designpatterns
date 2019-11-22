package com.adapter;

/**
 * interface that is needed to Create Enemy
 * each enemy is required to have the methods defined in the interface implemented
 */
public interface EnemyAttacker {
    public void fireWeapon();

    public void driveForward();

    public void assignDriver(String driverName);
}
