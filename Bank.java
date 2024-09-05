// File: Bank.java
import java.util.*;

public class Bank {
    private Map<String, Account> accounts;
    private List<Transaction> transactions;

    public Bank() {
        accounts = new HashMap<>();
        transactions = new ArrayList<>();
    }

    // Create a new Savings Account
    public void createSavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        Account account = new SavingsAccount(accountNumber, holderName, balance, interestRate);
        accounts.put(accountNumber, account);
        System.out.println("Savings account created successfully.");
    }

    // Create a new Current Account
    public void createCurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        Account account = new CurrentAccount(accountNumber, holderName, balance, overdraftLimit);
        accounts.put(accountNumber, account);
        System.out.println("Current account created successfully.");
    }

    // Deposit money into account
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            String transactionId = UUID.randomUUID().toString();
            transactions.add(new Transaction(transactionId, accountNumber, amount, "Deposit"));
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw money from account
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            boolean success = account.withdraw(amount);
            if (success) {
                String transactionId = UUID.randomUUID().toString();
                transactions.add(new Transaction(transactionId, accountNumber, amount, "Withdrawal"));
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // View transactions for an account
    public void viewTransactions(String accountNumber) {
        System.out.println("Transactions for account " + accountNumber + ":");
        for (Transaction t : transactions) {
            if (t.toString().contains(accountNumber)) {
                System.out.println(t);
            }
        }
    }
}
