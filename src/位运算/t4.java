package 位运算;

import java.util.HashMap;
import java.util.Map;

public class t4 {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2){
            return nums;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int[] ans = new int[2];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                ans[index++] = entry.getKey();
            }
        }
        return ans;
    }
}
