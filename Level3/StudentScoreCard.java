import java.util.Scanner;
import java.util.Random;

public class StudentScoreCard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int[][] subjectMarks = generateRandomScores(numberOfStudents);
        double[][] results = calculateResults(subjectMarks);
        displayScoreCard(subjectMarks, results);
    }

    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] marks = new int[numberOfStudents][3];
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = 10 + random.nextInt(90);
            marks[i][1] = 10 + random.nextInt(90);
            marks[i][2] = 10 + random.nextInt(90);
        }

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    public static void displayScoreCard(int[][] marks, double[][] results) {
        System.out.println("Roll\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(marks[i][0] + "\t");
            System.out.print(marks[i][1] + "\t\t");
            System.out.print(marks[i][2] + "\t");

            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "\n");
        }
    }
}
