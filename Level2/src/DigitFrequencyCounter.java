import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if (number < 0) {
            System.err.println("Please enter a positive number.");
            return;
        }

        int temp = (int) number;
        int count = 0;
        long tempNum = number;

        while (tempNum > 0) {
            tempNum /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = count - 1;
        tempNum = number;

        while (tempNum > 0) {
            digits[index] = (int) (tempNum % 10);
            tempNum /= 10;
            index--;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " => " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
