package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class t9 {
    //定长
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
//    不定长
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> ans = new ArrayList<>();
//        int[] cnt = new int[26]; // 统计 p 的每种字母的出现次数
//        for (char c : p.toCharArray()) {
//            cnt[c - 'a']++;
//        }
//        int left = 0;
//        for (int right = 0; right < s.length(); right++) {
//            int c = s.charAt(right) - 'a';
//            cnt[c]--; // 右端点字母进入窗口
//            while (cnt[c] < 0) { // 字母 c 太多了
//                cnt[s.charAt(left) - 'a']++; // 左端点字母离开窗口
//                left++;
//            }
//            if (right - left + 1 == p.length()) { // s' 和 p 的每种字母的出现次数都相同
//                ans.add(left); // s' 左端点下标加入答案
//            }
//        }
//        return ans;
//    }
}
