package model.Offices;

import model.ObserverPattern.ObserverOffice;
import model.Transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Klasa TaxOffice - urząd skarbowy, zajmuje się gromadzeniem informacji o transakcjach operujących powyżej kwoty regulowanej
 */

public class TaxOffice implements ObserverOffice {

    ArrayList<String> shadyOperations;
    Connection connection;

    public TaxOffice(Connection connection){
        this.connection = connection;
        this.shadyOperations = new ArrayList<>();
    }

    @Override
    public void update(Transaction t) {
        String operationType = (t.getSender() == t.getReceiver()) ? "dep/with" : "transfer";
        String shadyString = "Operation type: " + operationType
                + ", sender: " + t.getSender().getOwner().toString()
                + ", receiver: " + t.getReceiver().getOwner().toString()
                + ", amount: " + t.getAmount();
        shadyOperations.add(shadyString);
        System.out.println(shadyString);
        String query = "insert into transactions(ownerFrom,ownerTo,amount) values('"
                +t.getSender().getOwner().toString()
                +"','"
                +t.getReceiver().getOwner().toString()
                +"',"
                +t.getAmount()
                +")";
        try {
            Statement st = connection.createStatement();
            st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void raport(){
        System.out.println("\n===================================\nReport of registered operations\n===================================");
        for (String operation : shadyOperations){
            System.out.println(operation);
        }
    }
}
