public class Pattern2 {

    /*
    Pattern 2:
    https://practice.geeksforgeeks.org/problems/right-triangle/1

    *
    * *
    * * *
    * * * *
    * * * * *

     */

    static void printTriangle(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(6);
    }
}
