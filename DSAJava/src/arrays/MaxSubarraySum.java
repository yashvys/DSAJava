package arrays;

public class MaxSubarraySum {

	// Function to find the maximum subarray sum using Kadane's Algorithm
	public static int maxSubarraySum(int[] arr) {
		int maxSum = arr[0]; // Initialize the maximum sum as the first element
		int currentSum = arr[0]; // Initialize current sum as the first element

		// Traverse the array from the second element to the end
		for (int i = 1; i < arr.length; i++) {
			// Update current sum: either start a new subarray or extend the current
			// subarray
			currentSum = Math.max(arr[i], currentSum + arr[i]);

			// Update maxSum if the current sum is greater
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum; // Return the maximum subarray sum
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		// Display the maximum subarray sum
		System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
	}
}
