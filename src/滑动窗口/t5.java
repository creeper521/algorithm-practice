package 滑动窗口;

import java.util.HashMap;
//https://leetcode.cn/problems/fruit-into-baskets/description/
public class t5 {
    public int totalFruit(int[] fruits) {
        int ans = 0,n = fruits.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        for(int right = 0;right < n;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0) + 1);
            while(map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}
