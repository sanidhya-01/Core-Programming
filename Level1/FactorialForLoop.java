import java.util.Scanner;
class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number >= 1) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        input.close();
    }
}
