import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int personCount = input.nextInt();

        double[] weights = new double[personCount];
        double[] heights = new double[personCount];
        double[] bmis = new double[personCount];
        String[] statuses = new String[personCount];

        for (int i = 0; i < personCount; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight in kilograms: ");
            double weight = input.nextDouble();
            if (weight <= 0) {
                System.err.println("Invalid weight. Please enter a positive number.");
                i--;
                continue;
            }

            System.out.print("Enter height in meters: ");
            double height = input.nextDouble();
            if (height <= 0) {
                System.err.println("Invalid height. Please enter a positive number.");
                i--;
                continue;
            }

            weights[i] = weight;
            heights[i] = height;

            double bmi = weight / (height * height);
            bmis[i] = bmi;

            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\n============= BMI Report =============");
        for (int i = 0; i < personCount; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }

        input.close();
    }
}