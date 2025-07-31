import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid number");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value to convert to number: ");
        String input = sc.next();

        System.out.println("Calling method to generate NumberFormatException:");
        // generateNumberFormatException(input); // Uncomment to see crash

        System.out.println("Calling method to handle NumberFormatException:");
        handleNumberFormatException(input);

        sc.close();
    }
}
