package 贪心;

import java.util.ArrayList;

//https://leetcode.cn/problems/longest-increasing-subsequence/
public class t5 {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        list.add(nums[0]);
        for (int i = 1; i < n; i++){
            if(nums[i] > list.get(list.size() - 1)){
                list.add(nums[i]);
            }else {
                int left = 0, right = list.size() - 1;
                while (left < right){
                    int mid = (left + right) / 2;
                    if(list.get(mid) < nums[i]){
                        left = mid + 1;
                    }else {
                        right = mid;
                    }
                }
                list.set(left,nums[i]);
            }
        }
        return list.size();
    }
}
