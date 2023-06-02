package algorithm.searching;

public class LinearSearch {
    public static int linearSearch(int[] array, int searchedElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchedElement) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 0, 5, 88, 23, 56};
        int index = linearSearch(array, 20);
        if (index != -1) {
            System.out.println("Found!");
        } else {
            System.out.println("Not Found!");
        }
    }
}
