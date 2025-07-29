import java.util.Scanner;

public class NumberChecker2 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;        // digit
                result[index][1] = freq[i];  // frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigitsArray(number);
        int count = countDigits(number);
        int sumDigits = sumOfDigits(digits);
        int sumSquares = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digits);
        int[][] frequency = getDigitFrequency(digits);

        System.out.println("Total Digits: " + count);
        System.out.println("Sum of Digits: " + sumDigits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);
        System.out.println("Is Harshad Number: " + isHarshad);

        System.out.println("Digit Frequencies:");
        for (int[] row : frequency) {
            System.out.println("Digit " + row[0] + ": " + row[1] + " times");
        }
    }
}
