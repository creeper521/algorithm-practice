package 贪心;

//https://leetcode.cn/problems/longest-continuous-increasing-subsequence/
public class t7 {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if (n == 1)return 1;
        int ans = 1, left = 0, right = 1;
        while(right < n){
            if(nums[right] > nums[right - 1]){
                ans = Math.max(ans, right - left + 1);
                right++;
            }else{
                left = right;
                right++;
            }
        }
        return ans;
    }
}
