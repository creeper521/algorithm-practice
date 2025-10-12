package 动态规划;

public class t11 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n + 1][n + 2];

        //添加的两行初始化为最大值
        for(int i = 1; i <= n; i++){
            dp[i][0] = dp[i][n + 1] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j + 1])) + matrix[i - 1][j - 1];
            }
        }
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++){
            ans = Math.min(ans, dp[n][i]);
        }
        return ans;
    }
}
