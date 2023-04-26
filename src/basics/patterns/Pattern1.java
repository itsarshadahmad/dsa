package src.basics.patterns;

public class Pattern1 {
    /*
    Pattern 1:
    https://practice.geeksforgeeks.org/problems/square-pattern/1

     * * * *
     * * * *
     * * * *
     * * * *

     */
    static void printSquare(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquare(5);
    }
}
