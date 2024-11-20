package Sorting;

public class QuickSort {
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};
        sorter.quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");  // Output: 1 5 7 8 9 10
        }
    }
}

