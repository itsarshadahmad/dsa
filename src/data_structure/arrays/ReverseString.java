package src.data_structure.arrays;

public class ReverseString {
    String reverseUsingIteration(String str) {
//        String class is immutable that's why StringBuilder is used.
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }

    String reverseUsingBuiltInMethod(String str){
//        Using StringBuffer and StringBuilder to reverse
//        StringBuilder has more advantages and faster than StringBuffer.
//        return new StringBuffer(str).reverse().toString();
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        System.out.println(reverse.reverseUsingIteration("Jacob"));
        System.out.println(reverse.reverseUsingIteration("123456"));
        System.out.println(reverse.reverseUsingBuiltInMethod("My name is Arshad"));
    }
}