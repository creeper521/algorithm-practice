package hot100;

import java.util.HashSet;
import java.util.Set;

public class t3 {
    //抛开时间复杂度的话我想到的是滑动窗口
    //左开头找
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int nowAns = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int nowNum = num;
                int times = 1;
                while(set.contains(nowNum + 1)){
                    nowNum += 1;
                    times += 1;
                }
                nowAns = Math.max(nowAns, times);
            }
        }
        return nowAns;
    }
    //左右开找，并找到一个删掉一个
    public int longestConsecutive2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        int max = 0;
        for(int num: nums) {
            int cur_max = 0;
            if(set.contains(num)) {
                int temp = num;
                while(set.contains(temp)) {
                    set.remove(temp);
                    temp++;
                    cur_max++;
                }

                temp = num - 1;
                while(set.contains(temp)) {
                    set.remove(temp);
                    temp--;
                    cur_max++;
                }
            }

            max = Math.max(max, cur_max);
        }
        return max;
    }

}
