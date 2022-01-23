import java.util.ArrayList;
import exceptions.*;

public class Database {
    private ArrayList<User> userDataBase;
    private Admin admin;

    public Database(ArrayList<User> userDataBase, Admin admin) {
        this.userDataBase = userDataBase;
        this.admin = admin;
    }

    public User getUser(int id) throws NoUserEx{
        for(User u : userDataBase){
            if (u.getId() == id) return u;
        }
        throw new NoUserEx();
    }

    public boolean checkAccess(String login, String pass) throws DbLoginEx{
        if (login.equals(admin.getLogin()) && pass.equals(admin.getPass())) return true;
        else throw new DbLoginEx();
    }
}