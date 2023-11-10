package school.arrays;

/*

Reverse a String:
https://practice.geeksforgeeks.org/problems/java-reverse-a-string0416/1

*/

public class ReverseAString {
        public static void main(String[] args) {
            String S = "abcdef";
            System.out.println(reverse(S));
        }

        static String reverse(String S){
            StringBuilder sb = new StringBuilder();

            for (int i=S.length()-1; i>=0; i--){
                char ch = S.charAt(i);
                sb.append(ch);
            }

            return String.valueOf(sb);
        }
}
