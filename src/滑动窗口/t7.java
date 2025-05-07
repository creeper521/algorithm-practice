package 滑动窗口;

//https://leetcode.cn/problems/substring-with-concatenation-of-all-words/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t7 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int m = words.length,n = words[0].length(),slen = s.length();

        for(int i = 0;i < n;i++){
            if(i + m * n > slen){
                break;
            }//剪枝

            Map<String,Integer> map = new HashMap<>();
            for(int j = 0;j < m;j++){
                String word = s.substring(i + j * n , i + (j + 1) * n);
                map.put(word,map.getOrDefault(word,0) + 1);
            }//分组

            for(String word:words){
                map.put(word,map.getOrDefault(word,0) - 1);
                if(map.get(word) == 0){
                    map.remove(word);
                }
            }//初始化

            //开始滑动
            for(int start = i;start <= slen - m * n;start += n){
                if (start != i) {
                    //右移动
                    String input = s.substring(start + (m - 1) * n,start + m * n);
                    map.put(input,map.getOrDefault(input,0) + 1);
                    if(map.get(input) == 0)map.remove(input);

                    //左移动
                    String output = s.substring(start - n,start);
                    map.put(output,map.getOrDefault(output,0) - 1);
                    if(map.get(output) == 0)map.remove(output);
                }
                if(map.isEmpty())res.add(start);
            }
        }
        return res;
    }
}
