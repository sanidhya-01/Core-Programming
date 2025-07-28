import java.util.Scanner;

public class LargestDigitsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        final int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number. Please enter a positive number.");
            System.exit(0);
        }

        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            if (index == maxDigits) {
                break;
            }

            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\n===== Result =====");
        System.out.println("Digits in the number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        input.close();
    }
}
