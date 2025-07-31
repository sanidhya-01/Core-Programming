import java.util.Scanner;

public class ToUpperCaseCompare {

    public static String convertToUpperUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String upperWithCharAt = convertToUpperUsingCharAt(input);
        String upperWithBuiltIn = input.toUpperCase();

        boolean isSame = compareStringsUsingCharAt(upperWithCharAt, upperWithBuiltIn);

        System.out.println("Uppercase using charAt(): " + upperWithCharAt);
        System.out.println("Uppercase using toUpperCase(): " + upperWithBuiltIn);
        System.out.println("Are both uppercase results same? " + isSame);

        sc.close();
    }
}
