package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.BankAccount;
import model.Transaction;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxOfficeMainController  {

    @FXML
    Button btn_refresh, btn_search, btn_delete;
    @FXML
    TableView tab_transactions;
    @FXML
    TableColumn<Transaction, String> transactionID;
    @FXML
    TableColumn<Transaction, String> ownerFrom,ownerTo;
    @FXML
    TableColumn<Transaction, Double> amount;
    @FXML
    TextArea tb_delete, tb_search;
    @FXML
    TextField tf_searchId, tf_deleteId;

    Connection conn;
    BusinessLogic controller;

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setController(BusinessLogic controller) {
        this.controller = controller;
    }

    public void displayTransactions(ActionEvent event){
        String id, ownerFromStr, ownerToStr;
        BankAccount from, to;
        double amountD;
        ObservableList<Transaction> outputList = FXCollections.observableArrayList();


        try {
            ResultSet output = conn.createStatement().executeQuery("select * from transactions");

            while(output.next()){
                id = Integer.toString(output.getInt("transactionID"));
                ownerFromStr = output.getString("ownerFrom");
                ownerToStr = output.getString("ownerTo");
                amountD = output.getDouble("amount");
                from = returnByOwner(ownerFromStr);
                to = returnByOwner(ownerToStr);
                outputList.add(new Transaction(id, from, to, amountD));
            }

            transactionID.setCellValueFactory(new PropertyValueFactory<>("id"));
            ownerFrom.setCellValueFactory(new PropertyValueFactory<>("sender"));
            ownerTo.setCellValueFactory(new PropertyValueFactory<>("receiver"));
            amount.setCellValueFactory(new PropertyValueFactory<>("amount"));

            tab_transactions.setItems(outputList);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findTransactionById(ActionEvent event){
        try{
            String criteriaID = tf_searchId.getText();
            String transactionid,ownerfrom,ownerto,amount;
            boolean type;
            ResultSet output = conn.createStatement().executeQuery("select * from transactions where transactionID="+criteriaID);
            tb_search.setText("There is no transaction with id "+criteriaID+" in database");
            while(output.next()){
                transactionid = output.getString(1);
                ownerfrom = output.getString(2);
                ownerto = output.getString(3);
                amount = output.getString(4);
                type = ownerfrom.equals(ownerto);
                if(type){
                    tb_search.setText("transactionID:"+transactionid+"\nowner: "+ownerfrom+"\ntransactionType: deposit/withdraw"+"\namount: "+amount);
                } else {
                    tb_search.setText("transactionID:"+transactionid+"\ntransactionType: transfer"+"\nownerFrom: "+ownerfrom+"\nownerTo: "+ownerto +"\namount: "+amount);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteTransactionById(ActionEvent event){
        String criteriaID = tf_deleteId.getText();
        try {
            int res = conn.createStatement().executeUpdate("delete from transactions where transactionID="+criteriaID);
            tb_delete.setText(Integer.toString(res));
            switch (res) {
                case 1 -> tb_delete.setText("Successful deletion of transaction with id:" + criteriaID);
                case 0 -> tb_delete.setText("Deletion failed, no transaction with id:" + criteriaID + " found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public BankAccount returnByOwner(String name){
        return controller.getBank().getAccounts().stream().filter(account -> name.equals(account.getOwner().toString())).findFirst().orElse(null);
    }
}
