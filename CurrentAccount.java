// File: CurrentAccount.java
public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: $" + balance);
            return true;
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
            return false;
        }
    }
}
