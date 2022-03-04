package model.ObserverPattern;

import model.Transaction;

/*
 * Interfejs Observable
 */

public interface Observable {

    void addObserverOffice(ObserverOffice observer);
    void deleteObserverOffice(ObserverOffice observer);
    void notifyObserverOffices(Transaction t);

}
