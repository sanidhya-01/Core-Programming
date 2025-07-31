import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        int length = 0;
        try {
            while (true) {
                char c = text.charAt(length);
                frequency[c]++;
                length++;
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0';
    }

    public static void displayResult(char result) {
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char nonRepeating = findFirstNonRepeatingChar(input);
        displayResult(nonRepeating);
    }
}
