package 动态规划;

public class t12 {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n + 1][m + 1];

        //初始化
        for(int i = 0; i <= n; i++){dp[i][0] = Integer.MAX_VALUE;}
        for(int j = 0; j <= m; j++){dp[0][j] = Integer.MAX_VALUE;}
        dp[0][1] = dp[1][0] = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[n][m];
    }
}
