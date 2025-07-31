import java.util.Scanner;

public class StringCompare {

    public static boolean compareWithCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1, s2;
        boolean resultCharAt, resultEquals;

        System.out.print("Enter first string: ");
        s1 = sc.next();

        System.out.print("Enter second string: ");
        s2 = sc.next();

        resultCharAt = compareWithCharAt(s1, s2);
        resultEquals = s1.equals(s2);

        System.out.println("Using charAt(): " + resultCharAt);
        System.out.println("Using equals(): " + resultEquals);

        sc.close();
    }
}
