package Bank.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BankAccount {

    int accountNumber;
    double balance;

    ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {  //Admin interface
        this.balance = newBalance;
    }

    public void addBalance(double income) {
        transactions.add(new Transaction(income));
        this.balance += income;
    }

    public void withdrawBalance(double income) {
        transactions.add(new Transaction(income));
        this.balance -= income;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


}
