package arrays;

import java.util.Arrays;

/**
 * BubbleSort class implements the Bubble Sort algorithm in Java.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class BubbleSort {

    /**
     * Sorts an array using the Bubble Sort algorithm.
     * @param arr Array to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
