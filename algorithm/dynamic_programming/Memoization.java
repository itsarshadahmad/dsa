package algorithm.dynamic_programming;

import java.util.HashMap;

public class Memoization {
    private static final HashMap<Integer, Integer> cache = new HashMap<>();

    public static int addTo80(int num) {
        return num + 80;
    }

    public static int memoizeAddTo80(int num) {
        if (!cache.containsKey(num)) {
            System.out.println("Calculating");
            cache.put(num, addTo80(num));
        }
        return cache.get(num);
    }

    public static void main(String[] args) {
        System.out.println(memoizeAddTo80(5));
        System.out.println(memoizeAddTo80(5));
        System.out.println(memoizeAddTo80(5));
    }
}
