package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t6 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(i > 0 && nums[i - 1] == nums[i]){
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            int target = -nums[i];

            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1])left++;
                    while(left < right && nums[right] == nums[right + 1])right--;
                }else if(sum < target){
                    left++;
                }else right--;
            }

        }
        return list;
    }

}
