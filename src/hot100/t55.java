package hot100;

import java.util.*;

public class t55 {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> path = new ArrayList<>();
    boolean[] check;

    public List<List<Integer>> permute(int[] nums) {
        check = new boolean[nums.length]; // 初始化类级别的check数组
        dfs(nums);
        return ans;
    }

    public void dfs(int[] nums) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!check[i]) {
                path.add(nums[i]);
                check[i] = true;
                dfs(nums);
                check[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
