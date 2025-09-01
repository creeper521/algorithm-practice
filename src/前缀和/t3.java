package 前缀和;

//https://leetcode.cn/problems/product-of-array-except-self/description/

public class t3 {
//    public int[] productExceptSelf(int[] nums) {
//        int total = 1,falseTotal = 1,zero = 0;
//        for(int num:nums){
//            if(num != 0){
//                falseTotal *= num;
//            }else zero++;
//            total *= num;
//        }
//        for(int i = 0;i < nums.length;i++){
//            if (nums[i] != 0) {
//                nums[i] = total / nums[i];
//            }else{
//                if (zero == 1) {
//                    nums[i] = falseTotal;
//                }
//                else nums[i] = 0;
//            }
//        }
//        return nums;
//    }

    public int[] productExceptSelf(int[] nums) {
        int[]ans = new int[nums.length];int left = 0, right = nums.length - 1;
        int lp = 1, rp = 1;
        while (right >= 0 && left < nums.length) {
            ans[right] *= rp;
            ans[left] *= lp;
            lp *= nums[left++];
            rp *= nums[right--];
        }
        return ans;
    }//nb方法

}
