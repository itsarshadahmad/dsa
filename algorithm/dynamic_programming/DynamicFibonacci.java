package algorithm.dynamic_programming;

import java.util.HashMap;

public class DynamicFibonacci {
    private static final HashMap<Integer, Integer> cache = new HashMap<>();

    public static int fibonacci(int num) {
        if (cache.containsKey(num)) {
            return cache.get(num);
        }
        if (num < 2) {
            return num;
        }
        cache.put(num, fibonacci(num - 1) + fibonacci(num - 2));
        return cache.get(num);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(14));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(12));
    }
}
