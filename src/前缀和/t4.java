package 前缀和;

//https://leetcode.cn/problems/subarray-sum-equals-k/description/

import java.util.HashMap;

public class t4 {
    public int subarraySum(int[] nums, int k) {
       int ans = 0,pre = 0,n = nums.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);

       for(int i = 0;i < n;i++){
           pre += nums[i];
           if(map.containsKey(pre - k)){
               ans += map.get(pre - k);
           }
           map.put(pre,map.getOrDefault(pre,0) + 1);
       }
       return ans;
    }
}
