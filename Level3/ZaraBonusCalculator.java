import java.util.Random;

public class ZaraBonusCalculator {

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonus(employeeData);
        displayResults(employeeData, updatedData);
    }

    public static int[][] generateEmployeeData(int numberOfEmployees) {
        int[][] data = new int[numberOfEmployees][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000);
            int yearsOfService = 1 + rand.nextInt(10);
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }

        return data;
    }

    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            updatedData[i][0] = bonus;
            updatedData[i][1] = newSalary;
        }

        return updatedData;
    }

    public static void displayResults(int[][] employeeData, double[][] updatedData) {
        int totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s%-15s%-20s%-15s%-15s\n", "Emp No", "Old Salary", "Years of Service", "Bonus", "New Salary");

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            totalOldSalary += salary;
        }
    }
}