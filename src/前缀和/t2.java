package 前缀和;

//https://leetcode.cn/problems/tvdfij/

public class t2 {
    public int pivotIndex(int[] nums) {
        int des = -1,n = nums.length;
        int total = 0;
        for(int num:nums){
            total += num;
        }
        int leftTotal = 0;
        for(int i = 0;i < n;i++){
            if(leftTotal == total - nums[i] - leftTotal){
                return i;
            }
            leftTotal += nums[i];
        }
        return des;
    }
}
