package model;

import model.exceptions.NoMoneyEx;

/*
 * Interfejs Account, zawierający operacje wpłaty i wypłaty z konta
 */

public interface Account {

    void deposit(double amount);
    boolean withdraw(double amount) throws NoMoneyEx;

}
