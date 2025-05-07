package 滑动窗口;

import java.util.Arrays;

public class t1 {
//    public int minSubArrayLen(int target, int[] nums) {
//        int ans = Integer.MAX_VALUE,n = nums.length;
//        if(n == 0)return 0;
//        int i = 0,j = 0;
//        int sum = 0;
//        while(j < n){
//            sum += nums[j];
//            while(sum >= target){
//                ans = Math.min(ans,(j - i) + 1);
//                sum -= nums[i];
//                i++;
//            }
//            j++;
//        }
//
//        return ans == Integer.MAX_VALUE ? 0 : ans;
//    }
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE,n = nums.length;
        if(n == 0)return 0;
        int[] sums = new int[n + 1];
        for(int i = 1;i <= n;i++){
            sums[i] = nums[i - 1] + sums[i - 1];
        }
        for(int i = 1;i <= n;i++){
            int target1 = target + sums[i - 1];
            int bound = Arrays.binarySearch(sums,target1);
            if(bound < 0)bound = - bound - 1;
            if(bound <= n){
                ans = Math.min(ans,bound - i + 1);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
