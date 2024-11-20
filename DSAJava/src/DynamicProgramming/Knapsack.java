package DynamicProgramming;

public class Knapsack {
	public int knapSack(int W, int wt[], int val[], int n) {
		int[][] dp = new int[n + 1][W + 1];

		// Build the table dp[][] in bottom up manner
		for (int i = 0; i <= n; i++) {
			for (int w = 0; w <= W; w++) {
				if (i == 0 || w == 0) {
					dp[i][w] = 0;
				} else if (wt[i - 1] <= w) {
					dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
				} else {
					dp[i][w] = dp[i - 1][w];
				}
			}
		}

		return dp[n][W]; // Maximum value that can be obtained
	}

	public static void main(String[] args) {
		Knapsack knap = new Knapsack();
		int[] val = { 60, 100, 120 };
		int[] wt = { 10, 20, 30 };
		int W = 50;
		System.out.println(knap.knapSack(W, wt, val, val.length)); // Output: 220
	}
}
