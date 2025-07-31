import java.util.Scanner;

public class TextSplitter {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] splitIntoWords(String text) {
        int length = getLength(text);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                inWord = true;
                wordCount++;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        int start = 0;
        boolean isWord = false;

        for (int i = 0; i <= length; i++) {
            if (i < length && text.charAt(i) != ' ') {
                if (!isWord) {
                    start = i;
                    isWord = true;
                }
            } else {
                if (isWord) {
                    String word = "";
                    for (int j = start; j < i; j++) {
                        word += text.charAt(j);
                    }
                    words[index] = word;
                    index++;
                    isWord = false;
                }
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] customSplit = splitIntoWords(input);
        String[] builtInSplit = input.trim().split("\\s+");
        boolean isEqual = compareArrays(customSplit, builtInSplit);

        System.out.println("Custom Split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("Built-in Split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Are both splits equal? " + isEqual);
        scanner.close();
    }
}
