import java.util.Scanner;

public class MaxOfThree {
    public static int takeInput(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = takeInput(input, "Enter first number: ");
        int num2 = takeInput(input, "Enter second number: ");
        int num3 = takeInput(input, "Enter third number: ");

        int max = findMax(num1, num2, num3);
        System.out.println("Maximum number is: " + max);
    }
}
