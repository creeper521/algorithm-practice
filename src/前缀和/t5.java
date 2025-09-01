package 前缀和;

//https://leetcode.cn/problems/subarray-sums-divisible-by-k/description/

import java.util.HashMap;

public class t5 {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0,pre = 0,n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i = 0;i < n;i++){
            pre += nums[i];
//            ans += map.getOrDefault((pre % k + k) % k,0);
            if(map.containsKey((pre % k + k) % k)){
                ans += map.get((pre % k + k) % k);
            }
            map.put((pre % k + k) % k,map.getOrDefault((pre % k + k) % k,0) + 1);
        }
        return ans;
    }
}
