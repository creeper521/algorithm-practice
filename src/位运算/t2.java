package 位运算;

//https://leetcode.cn/problems/missing-number/description/

public class t2 {
    public int missingNumber(int[] nums) {
        int ans = nums.length;
        for(int i = 0;i < nums.length;i++)ans^= i^nums[i];
        return ans;
    }
}
