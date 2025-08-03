import java.util.Scanner;

public class TemperatureConverter {

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Convert (1) Celsius to Fahrenheit or (2) Fahrenheit to Celsius? ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = input.nextDouble();
            System.out.println("Fahrenheit: " + toFahrenheit(c));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = input.nextDouble();
            System.out.println("Celsius: " + toCelsius(f));
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
