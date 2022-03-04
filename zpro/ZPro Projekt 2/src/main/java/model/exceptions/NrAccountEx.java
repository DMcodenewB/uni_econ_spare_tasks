package model.exceptions;

/*
 * Wyjątek wyrzucany, gdy nie znaleziono konta o szukanym numerze
 */

public class NrAccountEx extends Exception{

    private final String nrAcc = "Account with this number does not exist!";

    public NrAccountEx() {}

    public String getMessage() {
        return nrAcc;
    }
}
