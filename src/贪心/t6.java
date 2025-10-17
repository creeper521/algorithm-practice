package 贪心;

//https://leetcode.cn/problems/increasing-triplet-subsequence/
public class t6 {
    public boolean increasingTriplet(int[] nums) {
        int a = nums[0], b = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > b)return true;
            else if(nums[i] > a)b = nums[i];
            else a = nums[i];
        }
        return false;
    }
}
