package Task2;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int lowerBound = 1;
            int upperBound = 100;
            int maxAttempts = 10;
            int rounds = 0;
            int wins = 0;

            boolean playAgain = true;

            while (playAgain) {
                System.out.println("\n===== Round " + (rounds + 1) + " =====");
                int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                int attempts = 0;
                boolean roundWon = false;

                while (attempts < maxAttempts) {
                    System.out.print("Guess the number between " + lowerBound + " and " + upperBound + ": ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                        roundWon = true;
                        wins++;
                        break;
                    }
                }

                if (!roundWon) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + numberToGuess + ".");
                }

                rounds++;

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainInput = scanner.next();
                playAgain = playAgainInput.equalsIgnoreCase("yes");
            }

            System.out.println("\nGame Over! You played " + rounds + " round(s) and won " + wins + " time(s).");
        }
}
