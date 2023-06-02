package basics.patterns;

public class Pattern9 {
    /*
    Pattern 9:
    https://practice.geeksforgeeks.org/problems/pattern/1

         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *

     */

    static void printDiamond(int n) {
        // Upper part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (j < (n - i - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    j++;
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n + i; j++) {
                if (j < (n - i - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    j++;
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(5);
    }
}
