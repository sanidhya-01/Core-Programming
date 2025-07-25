import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();


        if (year >= 1582) {


            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            }

            else if (year % 100 == 0) {
                System.out.println(year + " is Not a Leap Year.");
            }

            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            }

            else {
                System.out.println(year + " is Not a Leap Year.");
            }

        } else {

            System.out.println("Leap Year check is valid only for year 1582 and above.");
        }


        input.close();
    }
}
