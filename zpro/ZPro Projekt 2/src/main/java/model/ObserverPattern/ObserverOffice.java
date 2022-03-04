package model.ObserverPattern;

import model.BankAccount;
import model.Transaction;

/*
 * Interfejs ObserverOffice, który jest implementowany przez biura obserwujące operacje bankowe
 */

public interface ObserverOffice {

    void update(Transaction t);

}
