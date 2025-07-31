public class NullPointerDemo {

    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Length of the string: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot call method on null");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to generate NullPointerException:");
        // This will cause the program to crash if not handled
        // generateNullPointerException();

        System.out.println("Calling method to handle NullPointerException:");
        handleNullPointerException();
    }
}
