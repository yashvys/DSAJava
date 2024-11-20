package Sorting;

public class InsertionSort {
	public void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		InsertionSort sorter = new InsertionSort();
		int[] arr = { 12, 11, 13, 5, 6 };
		sorter.insertionSort(arr);
		for (int num : arr) {
			System.out.print(num + " "); // Output: 5 6 11 12 13
		}
	}
}
