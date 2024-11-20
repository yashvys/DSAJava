package Searching;

public class BinarySearch {
	public int binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid; // Element found, return index
			}

			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		BinarySearch searcher = new BinarySearch();
		int[] arr = { 1, 2, 4, 7, 9 };
		int index = searcher.binarySearch(arr, 4);
		System.out.println(index); // Output: 2 (index of element 4)
	}
}
