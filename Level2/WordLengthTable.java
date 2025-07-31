import java.util.Scanner;

public class WordLengthTable {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitWords(String text) {
        int length = getLength(text);
        String[] temp = new String[length];
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (!word.equals("")) {
                    temp[wordCount] = word;
                    wordCount++;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            temp[wordCount] = word;
            wordCount++;
        }

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = temp[i];
        }
        return words;
    }

    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthTable = getWordsWithLength(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int len = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(word + "\t\t" + len);
        }
    }
}

