import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string to check palindrome: ");
        String str = input.nextLine();

        System.out.println(str + (isPalindrome(str) ? " is a Palindrome." : " is NOT a Palindrome."));
    }
}
