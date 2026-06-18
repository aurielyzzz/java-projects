import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            int secretNumber = random.nextInt(10) + 1;
            int guess = 0;

            while (guess != secretNumber) {

                System.out.print("Guess a number from 1 to 10: ");
                guess = input.nextInt();

                if (guess < secretNumber) {
                    System.out.println("Too low!");
                }
                else if (guess > secretNumber) {
                    System.out.println("Too high!");
                }
                else {
                    System.out.println("You win!");
                }
            }

            input.nextLine(); // clears Enter

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.nextLine();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}