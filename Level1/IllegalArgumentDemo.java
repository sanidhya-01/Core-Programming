import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateIllegalArgument(String text) {
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    public static void handleIllegalArgument(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: Start index is greater than end index");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.next();

        System.out.println("Calling method to generate IllegalArgumentException:");
        // generateIllegalArgument(input); // Uncomment to see crash

        System.out.println("Calling method to handle IllegalArgumentException:");
        handleIllegalArgument(input);

        sc.close();
    }
}
