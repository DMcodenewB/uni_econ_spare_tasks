import java.util.ArrayList;

public class Testowanie {

    public static void main(String[] args) {
        Admin adm1 = new Admin("dawid", "pasieka");
        DatabaseServer s;
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Database> databases = new ArrayList<Database>();
        String userName;

        for(int i = 0; i < 5; i++) {
            users.clear();
            for (int j = 0; j < 50; j++) {
                userName = "user";
                userName += j;
                users.add(new User(j, userName));
            }
            databases.add(new Database(users, adm1));
        }

        s = new DatabaseServer(databases);
        Client c = new Client(s, databases.get(0));

        try{
            Database workingDB = c.connect(0, adm1.getLogin(), adm1.getPass());
            System.out.println(workingDB.getUser(10).toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
