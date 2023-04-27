package src.basics.patterns;

public class Pattern8 {
    /*
    Pattern 8:
    https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1

     *********
      *******
       *****
        ***
         *

     */

    static void printTriangle(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((n * 2 - 1) - (i + i)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
