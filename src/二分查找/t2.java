package 二分查找;

//https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class t2 {

    public int[] searchRange(int[] nums, int target) {
        int l = 0,r = nums.length - 1;
        int first = -1,last = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] == target){
                first = mid;
                r = mid - 1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        l = 0;
        r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] == target){
                last = mid;
                l = mid + 1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return new int[]{first,last};
    }
}
