import java.util.Scanner;

public class StringLengthFinder {

    public static int getLengthWithoutUsingLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return length;
    }

    public static void main(String[] args) {
        String inputText;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        inputText = scanner.next();
        int lengthWithoutUsingLength = getLengthWithoutUsingLength(inputText);
        int lengthUsingBuiltIn = inputText.length();
        System.out.println("Length without using length() method: " + lengthWithoutUsingLength);
        System.out.println("Length using built-in length() method: " + lengthUsingBuiltIn);
        scanner.close();
    }
}
