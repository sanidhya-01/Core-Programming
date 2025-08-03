import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check prime: ");
        int num = input.nextInt();

        System.out.println(num + (isPrime(num) ? " is a Prime number." : " is NOT a Prime number."));
    }
}
