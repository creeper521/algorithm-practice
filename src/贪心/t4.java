package 贪心;

//https://leetcode.cn/problems/wiggle-subsequence/
public class t4 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n < 2)return n;

        int ans = 0, left = 0;
        for(int i = 0; i < n - 1; i++){
            int right = nums[i + 1] - nums[i];
            if(right == 0)continue;
            if (left * right <= 0)ans++;
            left = right;
        }
        return ans + 1;
    }
}
