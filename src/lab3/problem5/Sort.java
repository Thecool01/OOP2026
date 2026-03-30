package lab3.problem5;

import java.util.Arrays;

public class Sort {
    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // MERGE SORT
    // <E extends Comparable<E>>: E is any type, BUT it must implement Comparable
    public static <E extends Comparable<E>> void mergeSort(E[] array) {

        if (array.length < 2) return;

        int mid = array.length / 2;

        // DIVIDING THE ARRAY
        E[] left = Arrays.copyOfRange(array, 0, mid);
        E[] right = Arrays.copyOfRange(array, mid, array.length);

        // DIVIDING THE ARRAY AGAIN AND AGAIN
        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static <E extends Comparable<E>> void merge(E[] result, E[] left, E[] right) {
        int i = 0, j = 0, k = 0;
        // left = [2, 5]
        // right = [1, 9]
        //
        // Lets compare:
        // 2 vs 1 → take 1
        // 2 vs 9 → take 2
        // 5 vs 9 → take 5
        // → add the rest of 9
        //
        // Result:
        // [1, 2, 5, 9]
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            }
            else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}
