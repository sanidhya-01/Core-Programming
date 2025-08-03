class CompareStrings {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";

        if (a.equals(b))
            System.out.println("Equal");
        else if (a.compareTo(b) < 0)
            System.out.println(a + " comes before " + b);
        else
            System.out.println(b + " comes before " + a);
    }
}
