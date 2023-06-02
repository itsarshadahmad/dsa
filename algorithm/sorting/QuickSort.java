package algorithm.sorting;

import java.util.Arrays;

public class QuickSort {

    public static Integer[] quickSort(Integer[] array, int left, int right) {
        int pivot;
        int partitionIndex;

        if (left < right) {
            pivot = right;
            System.out.println(Arrays.asList(array).subList(left, right + 1) + " by " + array[pivot]);
            partitionIndex = partition(array, pivot, left, right);
            System.out.println(Arrays.asList(array).subList(left, right + 1));

            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
        return array;
    }

    private static int partition(Integer[] array, int pivot, int left, int right) {
        int pivotValue = array[pivot];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (array[i] < pivotValue) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, right, partitionIndex);
        return partitionIndex;
    }

    private static void swap(Integer[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {10, 42, 55, 9, 4, 1, 2, 7};
        Integer[] sortedArray = quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
