import java.util.ArrayList;
import exceptions.*;

public class DatabaseServer {
    private ArrayList<Database> dataBases;

    public DatabaseServer(ArrayList<Database> dataBases) {
        this.dataBases = dataBases;
    }

    public Database connect(int databaseId, String login, String password) throws DbEx{
        Database d = dataBases.get(databaseId);
        try{
            d.checkAccess(login, password);
            return d;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
