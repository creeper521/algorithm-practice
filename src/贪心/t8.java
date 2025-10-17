package 贪心;

//https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/description/
public class t8 {
    public int maxProfit(int[] prices) {
        int ans = 0,minM = Integer.MAX_VALUE;
        for(int i = 0;i < prices.length;i++){
            ans = Math.max(ans, prices[i] - minM);
            minM = Math.min(minM, prices[i]);
        }
        return ans;
    }
}
