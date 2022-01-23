public class RangeEx extends ArithmeticException{

    String message;
    RangeEx(){
        this.message = "Wynik dzielenia poza zakresem";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
