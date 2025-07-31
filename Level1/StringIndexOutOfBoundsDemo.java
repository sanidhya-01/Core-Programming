import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Index is out of range");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = sc.next();

        System.out.println("Calling method to generate StringIndexOutOfBoundsException:");
        // generateStringIndexOutOfBounds(inputText); // Uncomment to see crash

        System.out.println("Calling method to handle StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBounds(inputText);

        sc.close();
    }
}
