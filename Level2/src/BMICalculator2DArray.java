import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int numberOfPersons = input.nextInt();

        double[][] personData = new double[numberOfPersons][3];  // [][0]=weight, [][1]=height, [][2]=BMI
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
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

            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n============= BMI Report =============");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    (i + 1),
                    personData[i][1],
                    personData[i][0],
                    personData[i][2],
                    weightStatus[i]);
        }

        input.close();
    }
}
