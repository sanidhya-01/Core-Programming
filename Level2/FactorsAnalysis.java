import java.util.Scanner;

public class FactorsAnalysis {

    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] getFactors(int number) {
        int factorCount = countFactors(number);
        int[] factors = new int[factorCount];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += value;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int value : factors) {
            product *= value;
        }
        return product;
    }

    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int value : factors) {
            System.out.print(value + " ");
        }

        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        int sumSquares = sumOfSquares(factors);

        System.out.println("\nSum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + sumSquares);
    }
}
