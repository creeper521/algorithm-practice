package 滑动窗口;

import java.util.Arrays;

public class t4 {
    public int minOperations(int[] nums, int x) {
        int ans = Integer.MAX_VALUE,n = nums.length;
        int sum = Arrays.stream(nums).sum();

        if(sum < x){
            return -1;
        }

        int right = 0;
        int leftSum = 0,rightSum = sum;
        for(int left = -1;left < n;left++){
            if(left != -1){
                leftSum += nums[left];
            }
            while(right < n && x < leftSum + rightSum){
                rightSum -= nums[right++];
            }
            if (x == leftSum + rightSum) {
                ans = Math.min(ans,(left + 1) + (n - right));
            }
        }
        return ans > n ? -1 : ans;
    }
}
