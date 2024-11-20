package Sorting;

public class MergeSort {
	public void merge(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			merge(arr, left, mid); // Sorting the left half
			merge(arr, mid + 1, right); // Sorting the right half

			mergeHalves(arr, left, mid, right);
		}
	}

	private void mergeHalves(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];

		System.arraycopy(arr, left, leftArr, 0, n1);
		System.arraycopy(arr, mid + 1, rightArr, 0, n2);

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		MergeSort sorter = new MergeSort();
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		sorter.merge(arr, 0, arr.length - 1);
		for (int num : arr) {
			System.out.print(num + " "); // Output: 3 9 10 27 38 43 82
		}
	}
}
