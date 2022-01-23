package exceptions;

public class DbEx extends Exception{

    String message;

    public DbEx(){
        this.message = "No id database in DatabaseServer in dataBases";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
