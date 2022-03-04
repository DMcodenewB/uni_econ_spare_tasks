package model;

import model.exceptions.NoMoneyEx;
import model.exceptions.NrAccountEx;

/*
 * Interfejs BankingOperations - podstawowe operacje dla Banku. Implementacja zawiera operacje na metodach obiektu BankAccount
 */

public interface BankingOperations {

    boolean deposit(int nrAccount, double amount) throws NrAccountEx;
    boolean withdraw(int nrAccount, double amount) throws NrAccountEx, NoMoneyEx;
    boolean transfer(int nrAccountFrom, int nrAccountTo, double amount) throws NrAccountEx, NoMoneyEx;

}
