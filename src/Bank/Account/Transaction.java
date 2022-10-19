package Bank.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Transaction {
    double amount;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String date = dtf.format(now);
    Transaction(double amount) {
        this.amount = amount;

    }

    public void showTransactions(double amount) {

    }
}
