package Bank.Clients;

import Bank.Account.BankAccount;
import Bank.Bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    ArrayList<BankAccount> ba = new ArrayList<BankAccount>();
    String firstName;
    String lastName;
    String socialSecurityNumber; //This is a string since this number could start with a 0.
    String partnerInformation;

    public Customer(String firstName, String lastName, String socialSecurityNumber, String partnerInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.partnerInformation = partnerInformation;
    }


}
