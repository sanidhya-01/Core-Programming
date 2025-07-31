import java.util.Scanner;

public class ToLowerCaseCompare {

    public static String convertToLowerUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32); // convert to lowercase
            } else {
                result += ch; // keep other characters as-is
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

        String lowerWithCharAt = convertToLowerUsingCharAt(input);
        String lowerWithBuiltIn = input.toLowerCase();

        boolean isSame = compareStringsUsingCharAt(lowerWithCharAt, lowerWithBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerWithCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerWithBuiltIn);
        System.out.println("Are both lowercase results same? " + isSame);

        sc.close();
    }
}
