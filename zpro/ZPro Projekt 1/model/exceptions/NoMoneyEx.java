package model.exceptions;

/*
 * Wyjątek wyrzucany, gdy na koncie znajduje się niewystarczająca ilość środków
 */


public class NoMoneyEx extends Exception{

    private final String noMoney = "Not enough money in account to withdraw!";

    public NoMoneyEx() {}

    public String getMessage() {
        return noMoney;
    }

}
