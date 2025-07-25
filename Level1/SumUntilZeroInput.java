import java.util.Scanner;

class SumUntilZeroInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number = -1;

        while (number != 0.0) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
            total += number;
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
