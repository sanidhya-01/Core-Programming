import java.util.Scanner;

public class ShortestLongestWordFinder {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitWords(String text) {
        int len = getLength(text);
        String[] temp = new String[len];
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongestIndexes(String[][] wordLengthTable) {
        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(wordLengthTable[0][1]);
        int maxLength = Integer.parseInt(wordLengthTable[0][1]);

        for (int i = 1; i < wordLengthTable.length; i++) {
            int currentLength = Integer.parseInt(wordLengthTable[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        int[] indexes = new int[2];
        indexes[0] = minIndex;
        indexes[1] = maxIndex;
        return indexes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthTable = getWordsWithLengths(words);
        int[] indexes = findShortestLongestIndexes(wordLengthTable);

        String shortestWord = wordLengthTable[indexes[0]][0];
        String longestWord = wordLengthTable[indexes[1]][0];

        System.out.println("\nShortest Word: " + shortestWord);
        System.out.println("Length: " + wordLengthTable[indexes[0]][1]);

        System.out.println("\nLongest Word: " + longestWord);
        System.out.println("Length: " + wordLengthTable[indexes[1]][1]);
    }
}
