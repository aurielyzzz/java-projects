import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            System.out.println("Rock, Paper, Scissors");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            System.out.print("Choose Rock, Paper, or Scissors: ");
            String player = input.nextLine().toLowerCase();

            String[] choices = {"rock", "paper", "scissors"};
            String computer = choices[random.nextInt(3)];

            System.out.println("Computer chose: " + computer);

            if (player.equals(computer)) {
                System.out.println("It's a tie!");
            }
            else if ((player.equals("rock") && computer.equals("scissors")) ||
                     (player.equals("paper") && computer.equals("rock")) ||
                     (player.equals("scissors") && computer.equals("paper"))) {
                System.out.println("You win!");
            }
            else {
                System.out.println("Computer wins!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = input.nextLine();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}