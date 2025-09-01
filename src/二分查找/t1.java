package 二分查找;

//https://leetcode.cn/problems/binary-search/description/

public class t1 {
    public int search(int[] nums, int target) {
        int ans = -1;
        int l = 0,r = nums.length - 1;
        int mid = 0;
        while(l <= r){
            mid = (l + r) / 2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
