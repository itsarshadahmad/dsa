package data_structure.bigO;

import java.util.HashSet;
import java.util.Set;

public class PairWithSum {

    // Naive
    static boolean hasPairWithSum(int[] arr, int sum) {
        var len = arr.length;
        for (var i = 0; i < len - 1; i++) {
            for (var j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }

        return false;
    }

    // Better
    static boolean hasPairWithSum2(int[] arr, int sum) {
        Set<Integer> mySet = new HashSet<>();
        var len = arr.length;
        for (var i = 0; i < len; i++) {
            if (mySet.contains(arr[i])) {
                return true;
            }
            mySet.add(sum - arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        var res = hasPairWithSum2(new int[] { 6, 4, 3, 2, 1, 7 }, 9);
        System.out.println(res);
    }
}
