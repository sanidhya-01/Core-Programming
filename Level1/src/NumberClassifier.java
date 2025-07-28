import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is Positive");
                System.out.println(num % 2 == 0 ? " and Even" : " and Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("First and Last numbers are Equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First number is Greater than the Last number.");
        } else {
            System.out.println("First number is Less than the Last number.");
        }

        input.close();
    }
}
