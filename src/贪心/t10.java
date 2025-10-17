package 贪心;

import java.util.Arrays;

//https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/
public class t10 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int ans = 0, n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < n;i++){
            ans += nums[i];
        }
        for(int i = 0;i < n;i++){
            if(nums[i] >= 0)break;
            else if(k > 0){
                ans -= 2 * nums[i];
                nums[i] = -nums[i];
                k--;
            }
        }
        Arrays.sort(nums);
        return k % 2 == 0 ? ans : ans - 2 * nums[0];
    }
}
