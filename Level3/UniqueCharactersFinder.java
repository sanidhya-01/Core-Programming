import java.util.Scanner;

public class UniqueCharactersFinder {

    public static int getTextLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int len = getTextLength(text);
        char[] uniqueChars = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    public static void displayUniqueCharacters(char[] unique) {
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(input);
        displayUniqueCharacters(uniqueCharacters);
    }
}
