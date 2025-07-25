import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("Leap Year check is valid only for year 1582 and above.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        input.close();
    }
}
