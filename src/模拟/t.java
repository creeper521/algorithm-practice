package 模拟;

//https://leetcode.cn/problems/replace-all-s-to-avoid-consecutive-repeating-characters/

import java.util.Arrays;

public class t {
    public String modifyString(String s) {
        char[] ans = s.toCharArray();
        int[] array = new int[30];

        Arrays.fill(array,0);
        for(int i = 0;i < ans.length;i++){
            if('z' - ans[i] < 26){
                
            }
        }
        return s;
    }
}
