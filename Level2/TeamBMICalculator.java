import java.util.Scanner;

public class TeamBMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightMeter = heightCm / 100.0;
        return weight / (heightMeter * heightMeter);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, BMI
        String[] status = new String[10];

        System.out.println("Enter weight (kg) and height (cm) for 10 individuals:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            double weight = input.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            double height = input.nextDouble();

            double bmi = calculateBMI(weight, height);
            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
            status[i] = getBMIStatus(bmi);
        }

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }

        input.close();
    }
}
