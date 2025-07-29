public class UnitConverter {

    public static double convertKmToMiles(double km) {
        double kmToMilesFactor = 0.621371;
        return km * kmToMilesFactor;
    }

    public static double convertMilesToKm(double miles) {
        double milesToKmFactor = 1.60934;
        return miles * milesToKmFactor;
    }

    public static double convertMetersToFeet(double meters) {
        double metersToFeetFactor = 3.28084;
        return meters * metersToFeetFactor;
    }

    public static double convertFeetToMeters(double feet) {
        double feetToMetersFactor = 0.3048;
        return feet * feetToMetersFactor;
    }

    public static void main(String[] args) {
        double km = 5;
        double miles = 3.1;
        double meters = 100;
        double feet = 328.084;

        System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
