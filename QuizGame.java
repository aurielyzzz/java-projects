import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            int score = 0;

            System.out.println("What color is the sky?");
            System.out.println("Green");
            System.out.println("Blue");
            System.out.println("Red");

            System.out.print("Answer: ");
            String answer = input.nextLine().toLowerCase();

            if (answer.equals("blue")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            System.out.println("Score: " + score + "/1");

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.nextLine();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}