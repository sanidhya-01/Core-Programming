import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeByComparison(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeByCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeByComparison(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeByCharArray(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Start-End Comparison): " + result1);
        System.out.println("Logic 2 (Recursion): " + result2);
        System.out.println("Logic 3 (Char Array Comparison): " + result3);
    }
}
