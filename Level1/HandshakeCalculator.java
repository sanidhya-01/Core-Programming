import java.util.Scanner;

public class HandshakeCalculator {

    public int calculateMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        HandshakeCalculator calculator = new HandshakeCalculator();
        int handshakes = calculator.calculateMaxHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + handshakes);

        scanner.close();
    }
}
