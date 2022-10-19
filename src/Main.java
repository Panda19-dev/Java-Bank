import Bank.Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        while(true) {
            MainMenu();
        }



    }
    public static void MainMenu() {
        System.out.println("----------------------------");
        System.out.println("|   1. Create account      |");
        System.out.println("|   2. Select account      |");
        System.out.println("|   3. Delete account      |");
        System.out.println("|   4. ");
    }

    public static void createAccountMenu() {

    }

    public static void selectAccountMenu() {

    }

    public static void deleteAccountMenu() {

    }
}