import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.*;
import model.Offices.*;
import view.*;
import controller.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class App extends Application {
    String url="jdbc:mysql://localhost:3306/zpro_2";
    String user="root";
    String pass="181960Pass";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected to " + url);
            BusinessLogic controller = new BusinessLogic();
            Owner o1 = new Owner("David", "Marshall");
            Owner o2 = new Owner("Kristof", "Chodak");
            Owner o3 = new Owner("Greg", "Schwarz");
            TaxOffice skarbowka = new TaxOffice(conn);
            Statement st = conn.createStatement();
            st.execute("delete from transactions;");
            st.close();


            controller.addNewAccount(o1, BusinessLogic.AccType.BANKING);
            controller.addNewAccount(o2, BusinessLogic.AccType.SAVING);
            controller.addNewAccount(o3, BusinessLogic.AccType.SAVING);

            controller.addObserver(skarbowka);
            controller.setNewInterestRate(0.5);

            controller.deposit(1, 500);
            controller.deposit(2, 1000);
            controller.deposit(3, 30000);


            controller.withdraw(1, 100);
            controller.withdraw(2, 1100);
            controller.withdraw(3, 11000);

            controller.transfer(1,2,100);
            controller.transfer(2,1,1000);
            controller.transfer(3,1,15000);

            //tricky przelewy

            controller.deposit(1,-100); //deposit ujemnej liczby
            controller.deposit(4, 10); //deposit na nieistniejące konto
            controller.withdraw(0, 100); //withdraw na nieistniejace konto
            controller.withdraw(1, -100); //withdraw nieistniejacej liczby


            FXMLLoader loader = new FXMLLoader(getClass().getResource("tax-office-main.fxml"));
            Parent root = loader.load();
            TaxOfficeMainController tax_controller = loader.getController();
            tax_controller.setConn(conn);
            tax_controller.setController(controller);

            primaryStage.setTitle("Tax Office ZPro 2");
            primaryStage.setScene(new Scene(root, 1280, 720));
            primaryStage.show();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
