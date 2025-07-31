import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        String bmiFormatted = String.format("%.2f", bmi);
        return new String[]{String.valueOf(weightKg), String.valueOf(heightCm), bmiFormatted, status};
    }

    public static String[][] computeAllBMI(double[][] data) {
        int totalPersons = data.length;
        String[][] result = new String[totalPersons][4];

        for (int i = 0; i < totalPersons; i++) {
            result[i] = calculateBMIAndStatus(data[i][0], data[i][1]);
        }

        return result;
    }

    public static void displayBMIData(String[][] result) {
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",
                    (i + 1),
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_PERSONS = 10;
        double[][] heightWeightData = new double[TOTAL_PERSONS][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < TOTAL_PERSONS; i++) {
            try {
                System.out.print("Person " + (i + 1) + " - Weight (kg): ");
                heightWeightData[i][0] = scanner.nextDouble();

                System.out.print("Person " + (i + 1) + " - Height (cm): ");
                heightWeightData[i][1] = scanner.nextDouble();

                if (heightWeightData[i][0] <= 0 || heightWeightData[i][1] <= 0) {
                    System.out.println("Invalid input. Please enter positive values.");
                    i--;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.next();
                i--;
            }
        }

        String[][] resultData = computeAllBMI(heightWeightData);
        displayBMIData(resultData);
    }
}
