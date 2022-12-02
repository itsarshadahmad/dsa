package src.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimumValue = array[i];
            int minimumIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (minimumValue > array[j]) {
                    minimumValue = array[j];
                    minimumIndex = j;
                }
            }
            int temp = array[i];
            array[i] = minimumValue;
            array[minimumIndex] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] values = {12, 4, 5, 11, 3, 9, 0};
        int[] sortedValues = selectionSort(values);
        System.out.println(Arrays.toString(sortedValues));
    }
}
