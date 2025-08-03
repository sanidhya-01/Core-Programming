class ToggleCase {
    public static void main(String[] args) {
        String str = "HeLLo";
        String res = "";

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                res += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                res += Character.toUpperCase(ch);
            else
                res += ch;
        }

        System.out.println("Toggled: " + res);
    }
}
