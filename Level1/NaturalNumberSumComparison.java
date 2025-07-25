import java.util.Scanner;

class NaturalNumberSumComparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number >= 1) {
            int sumByLoop = 0;
            int counter = 1;

            while (counter <= number) {
                sumByLoop += counter;
                counter++;
            }

            int sumByFormula = number * (number + 1) / 2;

            System.out.println("Sum by loop: " + sumByLoop);
            System.out.println("Sum by formula: " + sumByFormula);

            boolean isSame = (sumByLoop == sumByFormula);
            System.out.println("Are both results equal? " + isSame);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        input.close();
    }
}
