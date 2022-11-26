package src.algorithm.recursion;

public class Factorial {

    public static long findFactorialIterative(int number) {
        long total = 1;
        for (int i = number; i > 0; i--) {
            total *= i;
        }
        return total;
    }

    public static long findFactorialRecursively(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findFactorialRecursively(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorialRecursively(5));
        System.out.println(findFactorialIterative(5));
    }
}