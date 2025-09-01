package 滑动窗口;

import java.util.HashSet;
import java.util.Set;

public class t2 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int right = 0;
        int ans = 0;
        for(int i = 0;i < s.length();i++){
            if(i != 0){
                set.remove(s.charAt(i - 1));//左指针
            }
            while(right < s.length() && !set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }
            ans = Math.max(ans,(right - i));
        }
        return ans;
    }
}
