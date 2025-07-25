import java.util.Scanner;

class YoungestAndTallestFriend {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = input.nextDouble();

        String youngestFriend;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngestFriend = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        String tallestFriend;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallestFriend = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        input.close();
    }
}
