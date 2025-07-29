import java.util.Scanner;

public class LineAndDistanceCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.4f\n", distance);

        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        if (Double.isInfinite(lineEquation[0])) {
            System.out.println("Line Equation: x = " + x1);
        } else {
            System.out.printf("Line Equation: y = %.4fx + %.4f\n", lineEquation[0], lineEquation[1]);
        }
    }

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        if (x1 == x2) {
            result[0] = Double.POSITIVE_INFINITY;
            result[1] = Double.NaN;
        } else {
            double m = (y2 - y1) / (x2 - x1);
            double b = y1 - m * x1;
            result[0] = m;
            result[1] = b;
        }
        return result;
    }
}
