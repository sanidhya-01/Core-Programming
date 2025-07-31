import java.util.Scanner;

public class SimpleTrim {

    public static int[] findStartEnd(String text) {
        int start = 0, end = 0, i = 0;
        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (Exception e) {
            end = i - 1;
        }

        for (i = 0; i <= end; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (i = end; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    public static String customTrim(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean areSame(String a, String b) {
        int i = 0;
        try {
            while (true) {
                if (a.charAt(i) != b.charAt(i)) return false;
                i++;
            }
        } catch (Exception e) {
            try {
                a.charAt(i);
                return false;
            } catch (Exception e1) {
                try {
                    b.charAt(i);
                    return false;
                } catch (Exception e2) {
                    return true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = s.nextLine();

        int[] points = findStartEnd(input);
        String trimmedCustom = customTrim(input, points[0], points[1]);
        String trimmedBuiltIn = input.trim();
        boolean isSame = areSame(trimmedCustom, trimmedBuiltIn);

        System.out.println("Custom Trim: '" + trimmedCustom + "'");
        System.out.println("Built-in Trim: '" + trimmedBuiltIn + "'");
        System.out.println("Match: " + isSame);
    }
}
