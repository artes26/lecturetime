package ATM;

import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin;
    public static void main(String[] args) {
        // Create an instance of ATM with initial pin and balance

        String userName = "ayush";
        int uxyx=1626;
        int pxyz=162624;


        System.out.println("good morning ");
        Scanner ayu = new Scanner(System.in);
        System.out.println("user id : ");
        int a = ayu.nextInt();
        System.out.println("pass:");
        int pas = ayu.nextInt();
        //System.out.println(a);

        if (a==uxyx && pas==pxyz) {
            System.out.print("welcome : " );
            System.out.println(userName);
            ATM atm = new ATM(1234, 1000000.00);
            atm.run();
        }
        else {
            System.out.println(" USER / PASS DID NOT MATCHED");
        }






    }


    // Constructor
    public ATM(int pin, double initialBalance) {
        this.pin = pin;
        this.balance = initialBalance;
    }

    // Method to display menu and handle user input
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    transfer(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display the menu options
    private void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to check balance
    private void checkBalance() {
        System.out.printf("Your balance: $%.2f%n", balance);
    }

    // Method to deposit money
    private void deposit(Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.printf("Deposit of $%.2f successful. Your new balance is: $%.2f%n", amount, balance);
    }

    // Method to withdraw money
    private void withdraw(Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal of $%.2f successful. Your new balance is: $%.2f%n", amount, balance);
        }
    }

    // Method to transfer money
    private void transfer(Scanner scanner) {
        System.out.print("Enter transfer amount: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds. Transfer failed.");
        } else {
            balance -= amount;
            System.out.printf("Transfer of $%.2f successful. Your new balance is: $%.2f%n", amount, balance);
        }

    }

    // Main method to start the ATM

}

