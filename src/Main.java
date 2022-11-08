import Bank.Bank;
import Bank.Clients.Customer;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while(true) {
            MainMenu(sc, bank);
        }

    }
    public static void MainMenu(Scanner sc, Bank bank) {
        System.out.println("----------------------------");
        System.out.println("|   1. Create account      |");
        System.out.println("|   2. Select account      |");
        System.out.println("|   3. Delete account      |");
        System.out.println("|   4. Exit                |");
        System.out.println("----------------------------");

        String choice = sc.nextLine();

        switch (choice) { //
            case "1" -> createAccountMenu(sc, bank);
            case "2" -> selectAccountMenu(sc, bank);
            case "3" -> deleteAccountMenu(sc);
            case "4" -> System.exit(101);
        }
    }

    public static void createAccountMenu(Scanner sc, Bank bank) {
        System.out.flush();
        System.out.print("Enter Your First Name: ");
        String FirstName = sc.next();
        System.out.println();
        System.out.print("Enter Your Last Name: ");
        String LastName = sc.next();
        System.out.println();
        System.out.print("Enter your Social Security Number: ");
        String SocialSecurityNumber = sc.next();
        System.out.println();
        System.out.print("Enter your partner information (none is an option): ");
        String partnerInformation = sc.next();
        bank.newCustomer(SocialSecurityNumber, FirstName, LastName, partnerInformation);
    }

    public static void selectAccountMenu(Scanner sc, Bank bank) {
        System.out.flush();
        System.out.print("Enter the social security number for your account : ");
        String socialSecurityNumber = sc.next();
        Customer customer = bank.findCustomer(socialSecurityNumber);
        if(customer == null) {
            System.out.println("Account not found!");
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {
            }
            System.out.flush();

        }

    }

    public static void deleteAccountMenu(Scanner sc) {

    }
}