// File: BankingSystem.java
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        String accountNumber, holderName;
        double balance, interestRate, overdraftLimit, amount;

        while (true) {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Transactions");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.next();
                    System.out.print("Enter account holder name: ");
                    holderName = sc.next();
                    System.out.print("Enter initial balance: ");
                    balance = sc.nextDouble();
                    System.out.print("Enter interest rate: ");
                    interestRate = sc.nextDouble();
                    bank.createSavingsAccount(accountNumber, holderName, balance, interestRate);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.next();
                    System.out.print("Enter account holder name: ");
                    holderName = sc.next();
                    System.out.print("Enter initial balance: ");
                    balance = sc.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    overdraftLimit = sc.nextDouble();
                    bank.createCurrentAccount(accountNumber, holderName, balance, overdraftLimit);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.next();
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    bank.deposit(accountNumber, amount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.next();
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    bank.withdraw(accountNumber, amount);
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.next();
                    bank.viewTransactions(accountNumber);
                    break;

                case 6:
                    System.out.println("Exiting the system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
