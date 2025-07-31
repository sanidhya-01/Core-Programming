import java.util.Scanner;

public class CharacterFrequency {

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

    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int length = getTextLength(text);

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        boolean[] visited = new boolean[256];
        String[][] result = new String[length][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (!visited[c]) {
                visited[c] = true;
                result[index][0] = Character.toString(c);
                result[index][1] = Integer.toString(frequency[c]);
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void displayFrequencies(String[][] data) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findCharacterFrequencies(input);
        displayFrequencies(frequencies);
    }
}
