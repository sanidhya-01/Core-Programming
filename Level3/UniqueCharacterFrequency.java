import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static int getTextLength(String text) {
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

    public static char[] getUniqueCharacters(String text) {
        int length = getTextLength(text);
        char[] unique = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index] = current;
                index++;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] getFrequencies(String text) {
        int[] freq = new int[256];
        int length = getTextLength(text);

        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = getUniqueCharacters(text);
        int uniqueLength = getTextLength(new String(uniqueChars));
        String[][] result = new String[uniqueLength][2];

        for (int i = 0; i < uniqueLength; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void displayFrequencies(String[][] data) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyTable = getFrequencies(text);
        displayFrequencies(frequencyTable);
    }
}
