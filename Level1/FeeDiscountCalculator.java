import java.util.Scanner;

class FeeDiscountCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee;
        System.out.print("Enter the student fee in INR: ");
        fee = input.nextDouble();

        double discountPercent;
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
