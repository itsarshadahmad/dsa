package src.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static List<Integer> mergeSort(List<Integer> array) {
        if (array.size() == 1) {
            return array;
        }
        List<Integer> left = array.subList(0, array.size() / 2);
        System.out.println("Splitting left: " + left);
        List<Integer> right = array.subList(array.size() / 2, array.size());
        System.out.println("Splitting right: " + right);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> mergedList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                mergedList.add(left.get(leftIndex));
                leftIndex++;
            } else {
                mergedList.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        mergedList.addAll(left.subList(leftIndex, left.size()));
        mergedList.addAll(right.subList(rightIndex, right.size()));
        System.out.println("Merged List: " + mergedList);
        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(8, 4, 2, 4, 1, 5, 8, 2, 4, 9);
        List<Integer> sortedArray = mergeSort(array);
        System.out.println("Sorted List: " + sortedArray);
    }
}
