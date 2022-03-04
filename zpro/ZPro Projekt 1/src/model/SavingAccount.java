package model;

/*
 * Klasa SavingAccount - konto oszczędnościowe, dziedziczy po BankAccount.
 * Wyróżnia ją pole interest - stopa oprocentowania
 */

public class SavingAccount extends BankAccount{

    private double interest;

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public SavingAccount(){
        this.interest = 0;
    }

    public SavingAccount(double interest) {
        this.interest = interest;
    }

    public SavingAccount(double balance, Owner owner, int accountNumber) {
        super(balance, owner, accountNumber);
        this.interest = 0;
    }

    public String toString(){

        return super.toString()
                + ", interest: "
                + interest;
    }
}
