package 动态规划;

public class t5 {
    public int waysToStep(int n) {
        // 1. 创建 dp 表
        int MOD = (int)1e9 + 7;

        // 处理一下边界情况
        if(n == 1 || n == 2)
            return n;
        if(n == 3)
            return 4;

        // 2. 初始化
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        // 3. 填表
        for(int i = 4; i <= n; i++)
            dp[i] = ((dp[i - 1] + dp[i - 2]) % MOD + dp[i - 3]) % MOD;

        // 4. 返回值
        return dp[n];
    }


}
