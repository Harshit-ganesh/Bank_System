# Banking System Project

## Overview

The **Banking System** project is a simple Java-based application that demonstrates core Object-Oriented Programming (OOP) concepts and basic Data Structures and Algorithms (DSA). The system allows users to manage bank accounts, perform transactions, and view transaction history.

### Features

- **Account Management**: Create Savings and Current accounts.
- **Transaction Management**: Deposit and withdraw funds.
- **Transaction History**: View transaction history for each account.
- **OOP Concepts**: Utilizes encapsulation, inheritance, and polymorphism.
- **Data Structures**: Implements `HashMap` for account management and `ArrayList` for transaction history.

## Project Structure

1. **`Account.java`**: Base class for bank accounts with common functionalities.
2. **`SavingsAccount.java`**: Class representing savings accounts with interest functionality.
3. **`CurrentAccount.java`**: Class representing current accounts with overdraft functionality.
4. **`Transaction.java`**: Class for handling and recording transactions.
5. **`Bank.java`**: Class for managing multiple accounts and transactions.
6. **`BankingSystem.java`**: Main class with a command-line interface for interacting with the system.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed on your system.

### Installation

1. **Clone the Repository**

   ```sh
   git clone https://github.com/your-username/banking-system.git
   cd banking-system

2. **Compile the Java Files**
   
   Compile each Java file using the following commands:

   ```sh
   javac Account.java
   javac SavingsAccount.java
   javac CurrentAccount.java
   javac Transaction.java
   javac Bank.java
   javac BankingSystem.java

  This will create .class files for each Java source file.

### Running the Application
1. **Run the Main Class**

   Execute the BankingSystem class to start the application:
   ````sh
   java BankingSystem

2. **Using the Application**

   Once the application starts, you will see a menu with the following options:
   1.**`Create Savings Account`**: Create a new savings account.

   2.**`Create Current Account`**: Create a new current account.

   3.**`Deposit`**: Deposit money into an account.

   4.**`Withdraw`**: Withdraw money from an account.

   5.**`View Transactions`**: View the transaction history for an 
   account.

   6.**`Exit`**: Exit the application.
