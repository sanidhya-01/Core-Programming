import java.util.Scanner;

public class CollinearityCheck {

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

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        boolean isCollinearSlope = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearArea = checkCollinearByArea(x1, y1, x2, y2, x3, y3);

        if (isCollinearSlope && isCollinearArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }

    public static boolean checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        Double slopeAB = (x2 - x1 != 0) ? (y2 - y1) / (x2 - x1) : null;
        Double slopeBC = (x3 - x2 != 0) ? (y3 - y2) / (x3 - x2) : null;
        Double slopeAC = (x3 - x1 != 0) ? (y3 - y1) / (x3 - x1) : null;

        if (slopeAB == null || slopeBC == null || slopeAC == null) {
            return slopeAB == slopeBC && slopeBC == slopeAC;
        }

        return Math.abs(slopeAB - slopeBC) < 1e-9 && Math.abs(slopeBC - slopeAC) < 1e-9;
    }

    public static boolean checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }
}
