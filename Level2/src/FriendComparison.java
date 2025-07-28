import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int FRIEND_COUNT = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[FRIEND_COUNT];
        double[] heights = new double[FRIEND_COUNT];

        for (int i = 0; i < FRIEND_COUNT; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age: ");
            int age = input.nextInt();
            if (age <= 0) {
                System.err.println("Invalid age. Please enter a valid positive number.");
                i--;
                continue;
            }

            System.out.print("Enter height in cm: ");
            double height = input.nextDouble();
            if (height <= 0) {
                System.err.println("Invalid height. Please enter a valid positive number.");
                i--;
                continue;
            }

            ages[i] = age;
            heights[i] = height;
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < FRIEND_COUNT; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n===== Friend Analysis Result =====");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}
