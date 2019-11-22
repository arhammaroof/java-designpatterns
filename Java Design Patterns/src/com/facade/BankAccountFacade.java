package com.facade;

/**
 * This is a facade class that is using different objects to implement  the subsystem that is hidden from the client
 */

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    /**
     * Objects being used to implement the subsystem
     */
    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;
    WelcomeToBank bankWelcome;

    /**
     * Parameters to check if the account is valid
     * @param newAcctNum
     * @param newSecCode
     * all the objects are initialized in the construtor
     */
    public BankAccountFacade(int newAcctNum, int newSecCode){

        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();

        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();

    }

    public int getAccountNumber() { return accountNumber; }

    public int getSecurityCode() { return securityCode; }


    public void withdrawCash(double cashToGet){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

    public void depositCash(double cashToDeposit){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }
}
