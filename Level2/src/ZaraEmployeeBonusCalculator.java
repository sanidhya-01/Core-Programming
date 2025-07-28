import java.util.Scanner;

public class ZaraEmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;
        final double BONUS_RATE_MORE_THAN_5 = 0.05;
        final double BONUS_RATE_LESS_THAN_5 = 0.02;
        final int SERVICE_THRESHOLD = 5;

        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter salary: ");
            double salary = input.nextDouble();
            if (salary <= 0) {
                System.err.println("Invalid salary. Must be greater than 0. Please try again.");
                i--;
                continue;
            }

            System.out.print("Enter years of service: ");
            double service = input.nextDouble();
            if (service < 0) {
                System.err.println("Invalid years of service. Cannot be negative. Please try again.");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = service;
        }

        for (int i = 0; i < salaries.length; i++) {
            double bonusRate = (yearsOfService[i] > SERVICE_THRESHOLD)
                    ? BONUS_RATE_MORE_THAN_5
                    : BONUS_RATE_LESS_THAN_5;

            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n================ Zara Bonus Summary ================");
        System.out.printf("Total Bonus Payout: ₹%.2f\n", totalBonus);
        System.out.printf("Total Old Salary: ₹%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: ₹%.2f\n", totalNewSalary);

        System.out.println("\n=========== Employee-wise Salary Details ===========");
        for (int i = 0; i < salaries.length; i++) {
            System.out.printf("Employee %2d => Old Salary: ₹%.2f, Bonus: ₹%.2f, New Salary: ₹%.2f\n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        input.close();
    }
}
