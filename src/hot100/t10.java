package hot100;

import java.util.HashMap;

public class t10 {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length, ans = 0 ,pre = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);//满足刚好相等情况

        for(int i = 0;i < n;i++){
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                ans += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }

        return ans;
    }

    //优化版枚举
//    public int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for (int start = 0; start < nums.length; ++start) {
//            int sum = 0;
//            for (int end = start; end >= 0; --end) {
//                sum += nums[end];
//                if (sum == k) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }


}
