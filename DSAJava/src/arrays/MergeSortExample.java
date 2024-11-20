package arrays;

import java.util.Arrays;

public class MergeSortExample {

	// Merge function to merge two sorted halves
	public static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Copy data to temp arrays
		System.arraycopy(arr, left, leftArray, 0, n1);
		System.arraycopy(arr, mid + 1, rightArray, 0, n2);

		// Merge the temp arrays back into arr[left..right]
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Copy any remaining elements of leftArray, if any
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy any remaining elements of rightArray, if any
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Recursive merge sort function
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			// Recursively sort the first and second halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array: " + Arrays.toString(arr));

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
