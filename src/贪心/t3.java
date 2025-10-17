package 贪心;

import java.util.Arrays;

//https://leetcode.cn/problems/largest-number/
public class t3 {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strs[i] = nums[i] + "";

        }
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for(String str : strs){sb.append(str);}
        if(sb.charAt(0) == '0')return "0";
        return sb.toString();
    }


}
