package com.facade;

/**
 * class that checks if the Funds are available which are being requested before withdrawing and depositing the funds
 */
public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashWithdrawn) { cashInAccount -= cashWithdrawn; }

    public void increaseCashInAccount(double cashDeposited) { cashInAccount += cashDeposited; }

    /**
     * checks the cash if available then decrement the cash in account
     * @param cashToWithdrawal cash the user wants to withdraw
     * @return returns a boolean type depending upon the cash that needs to be withdrawn is available or not
     */
    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if(cashToWithdrawal > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());

            return true;

        }

    }

    /**
     * @param cashToDeposit the amount that needs to be doposited by the user
     */
    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());

    }
}
