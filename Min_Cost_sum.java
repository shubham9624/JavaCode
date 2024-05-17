package JavaCode;

public class Min_Cost_sum {
    public static int minCostPath(int[][] input) {
		//Your code goes here
		 int n = input.length;
    int m = input[0].length;
    int dp[][] = new int[n][m];
    
    dp[0][0] = input[0][0];
    
    // Initialize the first row
    for (int j = 1; j < m; j++) {
        dp[0][j] = dp[0][j - 1] + input[0][j];
    }
    
    // Initialize the first column
    for (int i = 1; i < n; i++) {
        dp[i][0] = dp[i - 1][0] + input[i][0];
    }
    
    // Fill the rest of the dp array
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            dp[i][j] = input[i][j] + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
        }
    }
    
    return dp[n - 1][m - 1];
	}
    
}
