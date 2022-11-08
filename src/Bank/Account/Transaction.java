package Bank.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Transaction {
    double amount;
    LocalDateTime time;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    Transaction(double amount) {
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    public void PrintDate() {
        System.out.println(dtf.format(time));
    }
    public void ShowTransaction() {

    }
}
