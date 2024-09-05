// File: Transaction.java
import java.util.Date;

public class Transaction {
    private String transactionId;
    private String accountNumber;
    private double amount;
    private String type;  // deposit or withdrawal
    private Date date;

    public Transaction(String transactionId, String accountNumber, double amount, String type) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
