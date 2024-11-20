package Searching;

public class LinearSearch {
	public int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i; // Element found, return index
			}
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		LinearSearch searcher = new LinearSearch();
		int[] arr = { 4, 2, 7, 1, 9 };
		int index = searcher.linearSearch(arr, 7);
		System.out.println(index); // Output: 2 (index of element 7)
	}
}
