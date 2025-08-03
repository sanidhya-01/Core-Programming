class RemoveChar {
    public static void main(String[] args) {
        String str = "Hello World";
        char remove = 'l';
        String res = "";

        for (char ch : str.toCharArray()) {
            if (ch != remove) res += ch;
        }

        System.out.println("Modified: " + res);
    }
}
