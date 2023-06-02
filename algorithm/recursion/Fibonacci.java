package algorithm.recursion;

public class Fibonacci {

    public static int fibonacciIterative(int num) { // O(n)
        if (num == 0) {
            return 0;
        }

        int currentValue = 1;
        int temp = 0;
        int previousValue = 0;

        for (int i = 1; i < num; i++) {
            temp = currentValue;
            currentValue += previousValue;
            previousValue = temp;
        }
        return currentValue;
    }

    public static int fibonacciRecursive(int num) { // O(2^n)
        if (num < 2) {
            return num;
        }
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }

    public static int fibonacciRecursivelyEfficient(int n, int val, int prev) { // O(n)
        if (n == 0) {
            return prev;
        }
        if (n == 1) {
            return val;
        }
        return fibonacciRecursivelyEfficient(n - 1, val + prev, val);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(10));
        System.out.println(fibonacciRecursive(10));
        System.out.println(fibonacciRecursivelyEfficient(10, 1, 0));
    }
}
