package model;

public class Transaction {

    private String id;
    private String sender;
    private String receiver;
    private double amount;
    private String operationType;
    private BankAccount senderAcc;
    private BankAccount receiverAcc;

    public Transaction(String id, BankAccount senderacc, BankAccount receiveracc, double amount) {
        this.id = id;
        this.sender = senderacc.getOwner().toString();
        this.receiver = receiveracc.getOwner().toString();
        this.amount = amount;
        this.senderAcc = senderacc;
        this.receiverAcc = receiveracc;
    }

    public String getId() {
        return id;
    }

    public BankAccount getSender() {
        return senderAcc;
    }

    public BankAccount getReceiver() {
        return receiverAcc;
    }

    public double getAmount() {
        return amount;
    }
}
