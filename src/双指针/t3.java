package 双指针;

import java.util.Arrays;

public class t3 {
    //优化后
    public int triangleNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            int k = i + 1;
            for(int j = i + 1;j <nums.length;j++){
                while(k + 1 < nums.length && nums[k + 1] < nums[i] + nums[j]){
                    k++;
                }
                ans += Math.max(k - j,0);
            }
        }
        return ans;
    }
//    public int triangleNumber(int[] nums) {
//        int ans = 0;
//        Arrays.sort(nums);
//        for(int i = 0;i < nums.length;i++){
//            for(int j = i + 1;j < nums.length;j++){
//                int left = j + 1,right = nums.length - 1,k = j;
//                while (left <= right) {
//                    int mid = (left + right)/2;
//                    if(nums[i] + nums[j] > nums[mid]){
//                        k = mid;
//                        left = mid + 1;
//                    }else{
//                        right = mid - 1;
//                    }
//                }
//                ans += k - j;
//            }
//        }
//        return ans;
//    }
}
