package basics.patterns;

public class Pattern3 {
    /*
    Pattern 3:
    https://practice.geeksforgeeks.org/problems/triangle-number/1

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */

    static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
