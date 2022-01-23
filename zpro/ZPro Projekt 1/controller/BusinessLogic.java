package controller;

import model.*;
import model.ObserverPattern.ObserverOffice;
import model.exceptions.NoMoneyEx;
import model.exceptions.NrAccountEx;

/*
 * Klasa BusinessLogic - Kontroler
 * Zawiera referencję do Banku, na którym wykonuje operacje.
 * Zawiera również pole enum dla typu konta, które jest zakładane.
 */

public class BusinessLogic {

    private Bank bank;

    public enum AccType{
        BANKING,
        SAVING
    }

    public BusinessLogic(){
        this.bank = new Bank();
    }

    public void addNewAccount(Owner owner, AccType type){
        bank.addAccount(owner, type);
    }

    public void setNewInterestRate(double newRate){
        bank.setNewInterestRate(newRate);
    }

    public void addObserver(ObserverOffice o){
        bank.addObserverOffice(o);
    }

    public void deposit(int nrAccount, double amount) {
        if(amount >= 0) {
            try {
                if (bank.deposit(nrAccount, amount))
                    System.out.println("Deposit to account nr " + nrAccount + " for " + amount + " successful.");
                else System.out.println("Deposit to account nr " + nrAccount + " for " + amount + " unsuccessful.");
            } catch (NrAccountEx ex) {
                System.out.println(ex.getMessage());
            }
        } else System.out.println("Please enter a non-negative number!");
    }

    public void withdraw(int nrAccount, double amount) {
        if (amount >= 0) {
            try {
                if (bank.withdraw(nrAccount, amount))
                    System.out.println("Withdraw from account nr " + nrAccount + " for " + amount + " successful.");
                else System.out.println("Withdraw from account nr " + nrAccount + " for " + amount + " unsuccessful.");
            } catch (NrAccountEx | NoMoneyEx ex) {
                System.out.println(ex.getMessage());
            }
        } else System.out.println("Please enter a non-negative number!");
    }

    public void transfer(int nrAccountFrom, int nrAccountTo, double amount) {
        if(amount >= 0) {
            try {
                if (bank.transfer(nrAccountFrom, nrAccountTo, amount))
                    System.out.println("Transfer from account nr " + nrAccountFrom + " to account nr " + nrAccountTo + " for " + amount + " successful.");
                else
                    System.out.println("Transfer from account nr " + nrAccountFrom + " to account nr " + nrAccountTo + " for " + amount + " unsuccessful.");
            } catch (NrAccountEx | NoMoneyEx ex) {
                System.out.println(ex.getMessage());
            }
        } else System.out.println("Please enter a non-negative number!");
    }


    public void printAccInfo(){
        System.out.println("\n===================================\nCurrent state of bank accounts\n===================================");
        for (BankAccount b : bank.getAccounts()){
            System.out.println(b.toString());
        }
        System.out.println();
    }

}
