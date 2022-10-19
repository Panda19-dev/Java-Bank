package Bank.Clients;

import Bank.Account.BankAccount;

public class Customer {

    BankAccount ca;
    String firstName;
    String lastName;
    String socialSecurityNumber; //This is a string since this number could start with a 0.
    String partnerInformation;

    Customer(BankAccount ca, String firstName, String lastName, String socialSecurityNumber, String partnerInformation) {
        this.ca = ca;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.partnerInformation = partnerInformation;
    }


}
