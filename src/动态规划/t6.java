package 动态规划;

public class t6 {
    public int minCostClimbingStairs(int[] cost) {
        // 1. 创建 dp 表：dp[i] 表示到达第 i 层台阶时的最小花费
        int n = cost.length; // 台阶总数
        int[] dp = new int[n + 1]; // dp 数组大小为 n+1，因为要包含第 n 层（索引 n）

        // 2. 初始化：dp[0] 和 dp[1] 分别表示跳到第 0 层和第 1 层的花费（可以从任意一层出发）
        // 注意，这里不需要单独初始化，因为后面会在循环中计算得到

        // 3. 填表：从第 2 层开始，计算每层的最小花费
        for (int i = 2; i <= n; i++) {
            // 花费 = min(从第 i-1 层跳过来的花费 + cost[i-1], 从第 i-2 层跳过来的花费 + cost[i-2])
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        // 4. 返回值：dp[n] 表示跳到第 n 层（即终点）的最小花费
        return dp[n];
    }

}
