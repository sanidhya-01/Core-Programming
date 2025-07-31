import java.util.Scanner;

public class SubstringCompare {

    public static String createSubstringWithCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStringsWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        int startIndex, endIndex;

        System.out.print("Enter the text: ");
        input = sc.next();

        System.out.print("Enter start index: ");
        startIndex = sc.nextInt();

        System.out.print("Enter end index: ");
        endIndex = sc.nextInt();

        String substringWithCharAt = createSubstringWithCharAt(input, startIndex, endIndex);
        String substringWithBuiltIn = "";

        if (startIndex >= 0 && endIndex <= input.length() && startIndex < endIndex) {
            substringWithBuiltIn = input.substring(startIndex, endIndex);
        }

        boolean isEqual = compareStringsWithCharAt(substringWithCharAt, substringWithBuiltIn);

        System.out.println("Substring using charAt(): " + substringWithCharAt);
        System.out.println("Substring using substring(): " + substringWithBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);

        sc.close();
    }
}
