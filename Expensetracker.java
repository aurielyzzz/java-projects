import java.util.ArrayList;
import java.util.Scanner;

public class Expensetracker {
    static ArrayList<Double> expenses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. View Total");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amount = input.nextDouble();
                expenses.add(amount);
                System.out.println("Added!");
            }

            else if (choice == 2) {
                double total = 0;
                for (double e : expenses) total += e;
                System.out.println("Total spent: $" + total);
            }

            else if (choice == 3) {
                System.out.println("Bye!");
                break;
            }
        }
    }
}