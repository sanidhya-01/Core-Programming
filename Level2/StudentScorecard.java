import java.util.Random;

public class StudentScorecard {

    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(61) + 40;
            }
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((avg / 100.0) * 10000.0) / 100.0;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = percent;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] result) {
        int n = result.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double percent = result[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int)result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + grades[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] result = calculateTotalAveragePercentage(scores);
        String[] grades = calculateGrades(result);
        displayScorecard(scores, result, grades);
    }
}
