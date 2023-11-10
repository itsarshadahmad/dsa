public class Pattern5 {
    /*
    Pattern 5:
    https://practice.geeksforgeeks.org/problems/triangle-pattern/1

     * * * * *
     * * * *
     * * *
     * *
     *

     */

    static void printTriangle(int n) {
        // code here
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
