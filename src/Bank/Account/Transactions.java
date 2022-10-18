package Bank.Account;

import Bank.Clients.Customer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transactions {

    double amount;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    //System.out.println(dtf.format(now));

    Transactions() {

    }
}
