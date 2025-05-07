package 二分查找;
//https://leetcode.cn/problems/find-peak-element/description/
public class t6 {
    public int findPeakElement(int[] nums) {
//        int ans = 0;
//        for(int i = 1;i < nums.length;++i){
//            if(nums[i] > nums[ans]){
//                ans = i;
//            }
//        }
//        return ans;
        int l = 0,r = nums.length - 1;
        while(l < r){
            int mid = (l + r) / 2;
            if(nums[mid] > nums[mid + 1]){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}
