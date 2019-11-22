package com.facade;

/**
 * class that checks if the Account number is correct
 */
public class AccountNumberCheck {
    private int accountNumber = 12345678;

    public int getAccountNumber() { return accountNumber; }

    public boolean accountActive(int acctNumToCheck){

        if(acctNumToCheck == getAccountNumber()) {

            return true;

        } else {

            return false;

        }

    }
}
