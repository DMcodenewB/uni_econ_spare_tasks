package model;

import controller.BusinessLogic.AccType;
import model.ObserverPattern.Observable;
import model.ObserverPattern.ObserverOffice;
import model.exceptions.NoMoneyEx;
import model.exceptions.NrAccountEx;
import java.util.ArrayList;

/*
 * Klasa Bank - główna klasa modelu.
 * Zawiera listy obserwatorów i kont bankowych, określona jest też w niej regulowana kwota transakcji.
 * Gdy kwota transakcji przekracza regulowaną, o transakcji informowani są wszyscy obserwatorzy.
 */

public class Bank implements BankingOperations, Observable {

    ArrayList<BankAccount> accounts;
    ArrayList<ObserverOffice> observers;
    double regulatedAmount = 10000;
    BankAccount transferReceiver = null;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public ArrayList<ObserverOffice> getObservers(){
        return observers;
    }

    public ArrayList<BankAccount> getAccounts(){
        return accounts;
    }
    public void addAccount(Owner owner, AccType type){
        switch(type){
            case BANKING -> accounts.add(new BankAccount(0, owner, accounts.size()+1));
            case SAVING -> accounts.add(new SavingAccount(0, owner, accounts.size()+1));
        }

    }

    public void setNewInterestRate(double rate){
        for(BankAccount acc : accounts){
            if(acc instanceof SavingAccount){
                ((SavingAccount) acc).setInterest(rate);
            }
        }
        System.out.println("Interest rate changed on every account to " + rate);
    }

    @Override
    public boolean deposit(int nrAccount, double amount) throws NrAccountEx {
        boolean success = false;

        for(BankAccount b : accounts){
            if(b.getAccountNumber() == nrAccount){
                accounts.get(accounts.indexOf(b)).deposit(amount);
                success = true;
                if(amount > regulatedAmount){
                    notifyObserverOffices("deposit", b, amount);
                }
            }
        }
        if (!success) throw new NrAccountEx();

        return success;
    }

    @Override
    public boolean withdraw(int nrAccount, double amount) throws NrAccountEx, NoMoneyEx{
        boolean success = false;

        for(BankAccount b : accounts){
            if(b.getAccountNumber() == nrAccount){
                accounts.get(accounts.indexOf(b)).withdraw(amount);
                success = true;
                if(amount > regulatedAmount){
                    notifyObserverOffices("withdraw", b, amount);
                }
            }
        }
        if (!success) throw new NrAccountEx();

        return success;
    }

    @Override
    public boolean transfer(int nrAccountFrom, int nrAccountTo, double amount) throws NrAccountEx, NoMoneyEx{
        boolean success = false, from = false, to = false;
        int indexFrom = -1, indexTo = -1;

        //znajdowanie odpowiednich kont
        for(BankAccount b : accounts){
            if(b.getAccountNumber() == nrAccountFrom){
                indexFrom = accounts.indexOf(b);
                from = true;
            }
            if(b.getAccountNumber() == nrAccountTo){
                indexTo = accounts.indexOf(b);
                to = true;
            }
        }
        //przeprowadzenie transakcji
        if (from && to && accounts.get(indexFrom).withdraw(amount)){
            accounts.get(indexTo).deposit(amount);
            success = true;
            if(amount > regulatedAmount){
                transferReceiver = accounts.get(indexTo);
                notifyObserverOffices("transfer", accounts.get(indexFrom), amount);
            }
        }
        if (!success) {
            System.out.println("Transfer operation canceled.");
            if(indexFrom == -1 || indexTo == -1) throw new NrAccountEx();
        }

        return success;
    }

    @Override
    public void addObserverOffice(ObserverOffice observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserverOffice(ObserverOffice observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserverOffices(String operation, BankAccount acc, double amount) {
        for(ObserverOffice o : observers){
            if (operation.equals("transfer")) {
                o.update(operation, acc, transferReceiver, amount);
            } else {
                o.update(operation, acc, amount);
            }
        }
    }
}
