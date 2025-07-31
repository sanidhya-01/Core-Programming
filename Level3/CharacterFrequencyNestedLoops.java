import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    public static String[] getCharFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int size = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                size++;
            }
        }

        String[] result = new String[size];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void displayResult(String[] data) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            String[] parts = data[i].split(" -> ");
            System.out.println(parts[0] + "\t\t" + parts[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencies = getCharFrequencies(input);
        displayResult(frequencies);
    }
}
