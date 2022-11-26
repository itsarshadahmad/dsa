package src.data_structure.bigO;

// Given 2 src.data_structure.arrays, create a function that lets a user know (true/false) whether these two src.data_structure.arrays contain any common items
// For Example:
// const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
// should return false.
// -----------
// const array1 = ['a', 'b', 'c', 'x'];
// const array2 = ['z', 'y', 'x'];
// should return true.

// 2 parameters - src.data_structure.arrays - no size limit
// return true or false

import java.util.HashMap;
import java.util.Map;

public class ComparingTwoArrays {
    static boolean containsCommonItem1(char[] arr1, char[] arr2) {
        // O(n^2) or O(a*b)
//        O(1) - Space Complexity
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean containsCommonItem2(char[] arr1, char[] arr2) {

//        It can also be solved by some shorthand method which your programming language provides. It depends on you
//        language proficiency on that language.
//        O(n+m) or O(n) using map to check using key
//        O(n) - Space Complexity
        Map<Character, Boolean> map = new HashMap<>();
        for (char value : arr1) {
            map.put(value, true);
        }

        for (char c : arr2) {
            if (map.containsKey(c)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'z', 'y', 'a'};
        boolean res1 = containsCommonItem1(array1, array2);
        boolean res2 = containsCommonItem2(array1, array2);
        System.out.println(res1);
        System.out.println(res2);
    }
}
