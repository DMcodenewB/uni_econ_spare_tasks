import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11464882";
        String login = "sql11464882";
        String pass = "1vHTc2LwrX";


        try{

            Connection conn = DriverManager.getConnection(url, login, pass);
            System.out.println("ok");
            Statement stm = conn.createStatement();
            String select = "select * from student";

            ResultSet result = stm.executeQuery(select);

            while(result.next()){
                System.out.println(result.getString("name") + " " + result.getString("city") + " " + result.getString("age"));
            }

            String insert = "insert into `student`(`id`, `name`, `city`, `age`) values (3,'Karol','Wroclaw',38)";
            stm.executeUpdate(insert);

            result = stm.executeQuery(select);

            while(result.next()){
                System.out.println(result.getString("name") + " " + result.getString("city") + " " + result.getString("age"));
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
