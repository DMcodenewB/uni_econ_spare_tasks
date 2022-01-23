package exceptions;

public class DbLoginEx extends DbEx{

    public DbLoginEx(){
        this.message = "Incorrect login or password of admin";
    }

    public String getMessage(){
        return super.getMessage();
    }

}
