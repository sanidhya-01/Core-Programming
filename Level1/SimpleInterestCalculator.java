
import java.util.Scanner;
public class SimpleInterestCalculator {
    public double calculateSimpleInterest(double principal,double rate,double time){
        return (principal*rate*time)/100;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        double principal=sc.nextDouble();
        System.out.println("Enter Rate Of Interest:");
        double rate=sc.nextDouble();
        System.out.println("Enter Time in Years:");
        double time=sc.nextDouble();
        SimpleInterestCalculator Calculator=new SimpleInterestCalculator();
        double Interest=Calculator.calculateSimpleInterest(principal,rate,time);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate %.2f%% and Time %.2f years.%n",
                Interest, principal, rate, time);


    }

}