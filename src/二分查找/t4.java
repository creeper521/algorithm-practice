package 二分查找;
//https://leetcode.cn/problems/search-insert-position/
public class t4 {
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while(left<=right){
            int mid = (right - left)/2 + left;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return left;
    }
}
