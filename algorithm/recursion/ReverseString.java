package algorithm.recursion;

public class ReverseString {

    public static String reverseStringIteratively(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }

    public static String reverseStringRecursively(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return reverseStringRecursively(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseStringIteratively("Joe Rogan"));
        System.out.println(reverseStringRecursively("Joe Rogan"));
    }
}
