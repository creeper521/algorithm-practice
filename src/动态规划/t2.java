package 动态规划;
//https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=dynamic-programming
public class t2 {
    public int maxProfit(int[] prices) {
        int ans = 0,minM = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i = 0;i < n;i++){
            if(prices[i] < minM) {
                minM = prices[i];
            }else if(ans < prices[i] - minM){
                ans = prices[i] - minM;
            }
        }
        return ans;
    }
}
