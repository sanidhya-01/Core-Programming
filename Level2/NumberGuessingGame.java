import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }

    public static String getUserFeedback(Scanner input, int guess) {
        System.out.print("Is " + guess + " correct, too high, or too low? (correct/high/low): ");
        return input.nextLine().toLowerCase();
    }

    public static void playGame() {
        Scanner input = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;
        int guess;

        while (low <= high) {
            guess = generateGuess(low, high);
            feedback = getUserFeedback(input, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it.");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
