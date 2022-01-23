package exceptions;

public class NoUserEx extends Exception{
    String message;

    public NoUserEx(){
        this.message = "Database does not contain user with this id";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
