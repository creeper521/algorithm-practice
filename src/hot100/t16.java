package hot100;

import java.util.Arrays;

public class t16 {
    //暴力
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length, total = 1, falseTotal = 1, zero = 0;
        int[] ans = new int[n];

        for(int i = 0;i < n;i++){
            total *= nums[i];
            if(nums[i] != 0){
                falseTotal *= nums[i];
            }else zero++;
        }
        for(int i = 0;i < n;i++){
            if(nums[i] != 0){
                ans[i] = total / nums[i];
            }else if(zero == 1){
                ans[i] = falseTotal;
            }else ans[i] = 0;
        }
        return ans;
    }

    //双指针NB
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);

        int left = 0, right = n - 1;
        int lplus = 1, rplus = 1;

        while(left < n && right >= 0){
            ans[left] *= lplus;
            ans[right] *= rplus;
            lplus *= nums[left++];
            rplus *= nums[right--];
        }
        return ans;
    }
}
