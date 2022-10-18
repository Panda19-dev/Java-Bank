package Bank.Account;

import java.util.ArrayList;

public class ClientAccount {

    int accountNumber;
    double balance;

    ArrayList<Transactions> transactions = new ArrayList<>();

    ClientAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void addBalance(double income) {
        this.balance += income;
    }

    public void withdrawBalance(double income) {
        this.balance -= income;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


}
