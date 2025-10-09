package hot100;

import java.util.ArrayList;
import java.util.List;

public class t58 {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        dfs(digits,map,0,new StringBuilder(),ans);
        return ans;
    }

    private void dfs(String digits, String[] map, int i, StringBuilder stringBuilder, List<String> ans) {
        if(i==digits.length()){
            ans.add(stringBuilder.toString());
            return;
        }
        String s = map[digits.charAt(i)-'0'];
        for (int j = 0; j < s.length(); j++) {
            stringBuilder.append(s.charAt(j));
            dfs(digits, map, i + 1, stringBuilder, ans);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        return;
    }
}
