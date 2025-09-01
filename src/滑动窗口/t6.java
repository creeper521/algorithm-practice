package 滑动窗口;

//https://leetcode.cn/problems/find-all-anagrams-in-a-string/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t6 {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(),pLen = p.length();
        List<Integer> ans = new ArrayList<>();

        if(sLen < pLen)return new ArrayList<>();

        int[] sArray = new int[26];
        int[] pArray = new int[26];

        for(int i = 0;i < pLen;i++){
            sArray[s.charAt(i) - 'a']++;
            pArray[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sArray,pArray)){
            ans.add(0);
        }

        for(int j = 0;j < sLen - pLen;j++){
            sArray[s.charAt(j) - 'a']--;
            sArray[s.charAt(j + pLen) - 'a']++;
            if(Arrays.equals(sArray,pArray)){
                ans.add(j + 1);
            }
        }
        return ans;
    }
}
