package model.ObserverPattern;

import model.BankAccount;

/*
 * Interfejs Observable
 */

public interface Observable {

    void addObserverOffice(ObserverOffice observer);
    void deleteObserverOffice(ObserverOffice observer);
    void notifyObserverOffices(String operationType, BankAccount acc, double amount);

}
