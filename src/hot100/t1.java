package hot100;

//https://leetcode.cn/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked

import java.util.HashMap;
import java.util.Map;

public class t1 {

    static public int[] twoSum1(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        twoSum(new int[]{3,3},6);
    }
}
