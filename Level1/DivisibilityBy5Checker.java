import java.util.Scanner;

class DivisibilityBy5Checker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's divisible by 5: ");
        int number = input.nextInt();

        boolean isDivisibleBy5 = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleBy5);

        input.close();
    }
}
