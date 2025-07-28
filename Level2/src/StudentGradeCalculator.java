import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int[][] marks = new int[numberOfStudents][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics marks: ");
            int physics = input.nextInt();
            if (physics < 0) {
                System.err.println("Invalid marks. Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Chemistry marks: ");
            int chemistry = input.nextInt();
            if (chemistry < 0) {
                System.err.println("Invalid marks. Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Maths marks: ");
            int maths = input.nextInt();
            if (maths < 0) {
                System.err.println("Invalid marks. Please enter a positive value.");
                i--;
                continue;
            }

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            int totalMarks = physics + chemistry + maths;
            double percentage = totalMarks / 3.0;
            percentages[i] = percentage;

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("\n=========== Student Report ===========");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentages[i],
                    grades[i]);
        }

        input.close();
    }
}
