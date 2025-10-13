package 动态规划;

public class t17 {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if(n == 1){return 0;}

        //j=0时，处于买入状态，1为可交易状态，2为冷冻期状态
        int[][] dp = new int[n][3];

        //初始化
        dp[0][0] = -prices[0];

        for(int i = 1;i < n;i++){
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][2], dp[i - 1][1]);
            dp[i][2] = dp[i - 1][0] + prices[i];
        }
        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }
}
