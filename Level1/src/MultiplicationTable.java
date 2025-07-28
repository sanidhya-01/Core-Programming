import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }

        int[] results = new int[10];
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (i + 1);
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }

        scanner.close();
    }
}
