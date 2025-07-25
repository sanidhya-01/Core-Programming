import java.util.Scanner;
class NaturalNumberSumWithForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        if (number >= 1) {
            int sumByLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumByLoop += i;
            }

            int sumByFormula = number * (number + 1) / 2;

            System.out.println("Sum by loop: " + sumByLoop);
            System.out.println("Sum by formula: " + sumByFormula);
            System.out.println("Are both results equal? " + (sumByLoop == sumByFormula));
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        input.close();
    }
}
