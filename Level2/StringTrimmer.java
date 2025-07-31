import java.util.Scanner;

public class StringTrimmer {

    public static int[] getTrimIndexes(String text) {
        int start = 0;
        int end = 0;
        int length = 0;

        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (Exception e) {
            try {
                s1.charAt(i);
                return false;
            } catch (Exception e1) {
                try {
                    s2.charAt(i);
                    return false;
                } catch (Exception e2) {
                    return true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        int[] indexes = getTrimIndexes(input);
        String trimmed = createSubstring(input, indexes[0], indexes[1]);
        String builtInTrim = input.trim();
        boolean isEqual = compareStrings(trimmed, builtInTrim);

        System.out.println("Custom trimmed string: '" + trimmed + "'");
        System.out.println("Built-in trimmed string: '" + builtInTrim + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);
    }
}
