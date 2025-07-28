import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int[][] marks = new int[numberOfStudents][3]; // [students][subjects]
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int subject = 0; subject < 3; subject++) {
                String subjectName = subject == 0 ? "Physics" : subject == 1 ? "Chemistry" : "Maths";

                while (true) {
                    System.out.print(subjectName + " marks: ");
                    int mark = input.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.err.println("Invalid marks. Enter a value between 0 and 100.");
                    } else {
                        marks[i][subject] = mark;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            double percent = percentages[i];

            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        System.out.println("\nResults:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\t% \tGrade");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%s\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentages[i],
                    grades[i]);
        }

        input.close();
    }
}
