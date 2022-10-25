package data_structure.arrays;

import java.util.Arrays;

// Merge two data_structure.arrays
public class MergeSortedArrays {

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < mergedArray.length; i++) {
            if (arr1.length > i) {
                mergedArray[i] = arr1[i];
            } else {
                mergedArray[i] = arr2[i - (arr1.length)];
            }
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 4, 8, 10};
        int[] array2 = {12, 14, 18, 20};
        System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));
    }
}
