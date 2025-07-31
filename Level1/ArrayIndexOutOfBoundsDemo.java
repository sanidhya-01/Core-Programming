import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateArrayIndexOutOfBounds(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    public static void handleArrayIndexOutOfBounds(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of array bounds");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] nameArray = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            nameArray[i] = sc.next();
        }

        System.out.println("Calling method to generate ArrayIndexOutOfBoundsException:");
        // generateArrayIndexOutOfBounds(nameArray); // Uncomment to see crash

        System.out.println("Calling method to handle ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBounds(nameArray);

        sc.close();
    }
}
