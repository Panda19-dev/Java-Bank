package Bank.Clients;

import Bank.Account.ClientAccount;

public class Customer {

    ClientAccount ca;
    String firstName;
    String lastName;
    int socialSecurityNumber;
    String partnerInformation;

    Customer(ClientAccount ca, String firstName, String lastName, int socialSecurityNumber, String partnerInformation) {
        this.ca = ca;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.partnerInformation = partnerInformation;
    }


}
