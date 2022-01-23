import exceptions.*;

public class Client {

    private DatabaseServer serverDB;
    private Database db;

    public Client(DatabaseServer serverDB, Database db) {
        this.serverDB = serverDB;
        this.db = db;
    }

    public Database connect(int databaseId, String login, String pass) throws DbEx{
        try {
            db = serverDB.connect(databaseId, login, pass);
            System.out.println("Połączono z bazą danych " + databaseId);
            return db;
        } catch (DbEx e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
