package hot100;

import java.util.HashSet;
import java.util.Set;

public class t3 {
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
}
