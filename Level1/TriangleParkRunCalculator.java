import java.util.Scanner;

public class TriangleParkRunCalculator {

    public double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public double calculateRounds(double perimeter, double distanceToRunMeters) {
        return distanceToRunMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        TriangleParkRunCalculator calculator = new TriangleParkRunCalculator();

        double perimeter = calculator.calculatePerimeter(side1, side2, side3);
        double distanceToRun = 5000.0; // 5 kilometers = 5000 meters
        double rounds = calculator.calculateRounds(perimeter, distanceToRun);

        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.%n", rounds);

        scanner.close();
    }
}
