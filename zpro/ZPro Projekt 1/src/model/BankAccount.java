package model;

import model.exceptions.NoMoneyEx;

/*
 * Klasa BankAccount - klasa konta bankowego. Musi posiadać Ownera - właściciela konta.
 */

public class BankAccount implements Account{

    private double balance;
    private Owner owner;
    private int accountNumber;

    public BankAccount(){
        this.balance = 0;
        this.owner = null;
    }

    public BankAccount(double balance, Owner owner, int accountNumber) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Owner getOwner() {
        return owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public boolean withdraw(double amount) throws NoMoneyEx{
        boolean success;
        double newBalance;
        newBalance = getBalance() - amount;
        if (newBalance < 0) throw new NoMoneyEx();
        else {
            setBalance(newBalance);
            success = true;
        }

        return success;
    }

    public String toString(){
        return "Account nr: "
                + accountNumber
                + ", owner: "
                + owner.toString()
                + ", balance: "
                + balance;
    }
}
