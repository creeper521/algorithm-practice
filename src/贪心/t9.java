package 贪心;

//https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/
public class t9 {
    public int maxProfit(int[] prices) {
        int ans = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                ans += prices[i + 1] - prices[i];
            }
        }

        return ans;
    }

}
