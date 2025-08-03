import java.util.Scanner;

public class GcdLcmCalculator {

    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("GCD: " + findGCD(a, b));
        System.out.println("LCM: " + findLCM(a, b));
    }
}
