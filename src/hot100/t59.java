package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t59 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(candidates, target, 0, 0, temp, ans);
        return ans;
    }

    public void dfs(int[] candidates, int target, int index, int sum, List<Integer> temp, List<List<Integer>> ans) {
        if(sum >= target){
            if (sum == target){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i = index; i < candidates.length; i++){
            temp.add(candidates[i]);
            dfs(candidates, target, i, sum + candidates[i], temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}
