package Sorting;

public class SelectionSort {
	public void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		SelectionSort sorter = new SelectionSort();
		int[] arr = { 64, 25, 12, 22, 11 };
		sorter.selectionSort(arr);
		for (int num : arr) {
			System.out.print(num + " "); // Output: 11 12 22 25 64
		}
	}
}
