package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Function to find two indices whose values add up to the target
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement is found in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // If complement is not found, store the number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        // Find the indices whose values add up to the target
        int[] result = twoSum(nums, target);

        // Print the result
        if (result.length > 0) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
