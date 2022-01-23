package model.ObserverPattern;

import model.BankAccount;

/*
 * Interfejs ObserverOffice, który jest implementowany przez biura obserwujące operacje bankowe
 */

public interface ObserverOffice {

    void update(String operationType, BankAccount transferSender, BankAccount transferReceiver, double amount);
    void update(String operationType, BankAccount bankAccount, double amount);

}
