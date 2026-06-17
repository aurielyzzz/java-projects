import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 0;

        while (true) {

            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Balance: $" + balance);
            }

            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = input.nextDouble();
                balance += amount;
                System.out.println("Deposited!");
            }

            else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                double amount = input.nextDouble();

                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdraw successful!");
                } else {
                    System.out.println("Not enough money.");
                }
            }

            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
