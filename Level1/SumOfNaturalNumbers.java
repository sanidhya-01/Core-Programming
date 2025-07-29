import java.util.Scanner;

public class SumOfNaturalNumbers {

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        SumOfNaturalNumbers calculator = new SumOfNaturalNumbers();
        int sum = calculator.calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
