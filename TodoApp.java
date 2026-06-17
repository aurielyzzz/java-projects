import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = input.nextLine();
                tasks.add(task);
                System.out.println("Task added!");
            }

            else if (choice == 2) {
                System.out.println("Your Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }

            else if (choice == 3) {
                System.out.print("Enter task number to remove: ");
                int index = input.nextInt();
                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                    System.out.println("Task removed!");
                } else {
                    System.out.println("Invalid number.");
                }
            }

            else if (choice == 4) {
                System.out.println("Bye!");
                break;
            }
        }
    }
}