package 前缀和;

//https://leetcode.cn/problems/contiguous-array/description/

import java.util.HashMap;
import java.util.Map;

public class t6 {
    public int findMaxLength(int[] nums) {
        int ans = 0,n = nums.length,count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(count,-1);
        for (int i = 0;i < n;i++){
            if(nums[i] == 1){
                count += 1;
            }else count -= 1;
            if(map.containsKey(count)){
                ans = Math.max(ans,i - map.get(count));
            }else map.put(count,i);
        }
        return ans;
    }
}
