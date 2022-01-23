public class DividingEx extends ArithmeticException{
    String message;
    DividingEx(){
        message = "Próba dzielenia przez 0";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
