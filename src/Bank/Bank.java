package Bank;

import Bank.Account.BankAccount;
import Bank.Clients.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Bank {

    HashMap<String, Customer> customers = new HashMap<>();

    public void newCustomer(String socialSecurityNumber, String firstName, String lastName, String partnerInformation) {
        int numberOfCustomers = customers.size();
        Customer customer = new Customer(firstName, lastName, socialSecurityNumber, partnerInformation);
        customers.put(socialSecurityNumber, customer);

    }

    public void addBankAccount() {

    }
    public Customer findCustomer(String SocialSecurityNumber) {
        try {
            return customers.get(SocialSecurityNumber);
        } catch (Exception e) {
            System.out.println(e); // Debugging
        }
        return null;
    }


}
