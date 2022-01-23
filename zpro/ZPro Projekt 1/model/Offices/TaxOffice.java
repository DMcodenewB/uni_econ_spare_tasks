package model.Offices;

import model.BankAccount;
import model.ObserverPattern.ObserverOffice;
import java.util.ArrayList;

/*
 * Klasa TaxOffice - urząd skarbowy, zajmuje się gromadzeniem informacji o transakcjach operujących powyżej kwoty regulowanej
 */

public class TaxOffice implements ObserverOffice {

    ArrayList<String> shadyOperations;

    public TaxOffice(){
        this.shadyOperations = new ArrayList<>();
    }

    @Override
    public void update(String operationType, BankAccount bankAccount, double amount) {
        String shadyString = "Operation type: " + operationType
                + ", account nr: " + bankAccount.getAccountNumber()
                + ", amount: " + amount;
        shadyOperations.add(shadyString);
        System.out.println(shadyString);
    }

    @Override
    public void update(String operationType, BankAccount transferSender, BankAccount transferReceiver, double amount) {
        String shadyString = "Operation type: " + operationType
                + ", sender account nr: " + transferSender.getAccountNumber()
                + ", receiver account nr: " + transferReceiver.getAccountNumber()
                + ", amount: " + amount;
        shadyOperations.add(shadyString);
        System.out.println(shadyString);
    }

    public void raport(){
        System.out.println("\n===================================\nReport of registered operations\n===================================");
        for (String operation : shadyOperations){
            System.out.println(operation);
        }
    }
}
