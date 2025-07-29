import java.util.Scanner;

public class MaxHandshakesCalculator {

    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        MaxHandshakesCalculator calculator = new MaxHandshakesCalculator();
        int handshakes = calculator.calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + handshakes);

        scanner.close();
    }
}
