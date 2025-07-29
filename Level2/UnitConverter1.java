public class UnitConverter1 {

    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3.0;
        return yards * yardsToFeet;
    }

    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inchesToCentimeters = 2.54;
        return inches * inchesToCentimeters;
    }

    public static void main(String[] args) {
        double yards = 2.5;
        double feet = 10.0;
        double meters = 1.0;
        double inches = 12.0;

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");
    }
}
