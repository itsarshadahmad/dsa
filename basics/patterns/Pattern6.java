package basics.patterns;

public class Pattern6 {

    /*
    Pattern 6:
    https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1

    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

     */

    static void printTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
