import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumUsingRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number + sumUsingRecursion(number - 1);
    }

    public static int sumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number (positive integer).");
            return;
        }

        int recursiveSum = sumUsingRecursion(number);
        int formulaSum = sumUsingFormula(number);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results are different.");
        }
    }
}
