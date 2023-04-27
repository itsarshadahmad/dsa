package src.basics.patterns;

public class Pattern7 {
    /*
    Pattern 7:
    https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1

        *
       ***
      *****
     *******
    *********

     */

    static void printTriangle(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 + 1); k++) {
                System.out.print("*");
            }
            // this part can be removed without affecting result
//            for (int l = 0; l < (n - 1 - i); l++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(8);
    }
}
