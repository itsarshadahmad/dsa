package src.basics.patterns;

public class Pattern4 {
    /*
    Pattern 4:
    https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1

    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5

     */

    static void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}
