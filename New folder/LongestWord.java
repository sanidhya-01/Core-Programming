class LongestWord {
    public static void main(String[] args) {
        String s = "Java is powerful";
        String[] words = s.split(" ");
        String longWord = "";

        for (String word : words) {
            if (word.length() > longWord.length())
                longWord = word;
        }

        System.out.println("Longest: " + longWord);
    }
}
