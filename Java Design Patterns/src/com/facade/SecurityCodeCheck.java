package com.facade;

/**
 * Class that checks if the security code is correct
 */
public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode() { return securityCode; }

    public boolean isCodeCorrect(int secCodeToCheck){

        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }
}
