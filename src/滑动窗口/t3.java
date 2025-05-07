package 滑动窗口;


import java.util.Scanner;

public class t3 {
    public static int longestOnes(int[] nums, int k) {
        int ans = 0,n = nums.length;
        int left = 0;
        for(int right = 0;right < n;right++){
            if(nums[right] == 0){
                k--;
            }

            while(k < 0){
                if(nums[left] == 0){
                    k--;
                }
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }

//    class Solution {
//        public int longestOnes(int[] A, int K) {
//            int l = 0, r = 0;
//            while (r < A.length) {
//                if (A[r++] == 0) K--;
//                if (K < 0 && A[l++] == 0) K++;
//            }
//            return r - l;
//        }
//    }
}
