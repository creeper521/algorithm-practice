package hot100;

import java.util.*;

public class t56 {
    //递归法实现子集枚举
//    List<List<Integer>> ans;
//    List<Integer> path;
//    public List<List<Integer>> subsets(int[] nums) {
//        ans = new ArrayList<>();
//        path = new ArrayList<>();
//
//        dfs(0, nums);
//
//        return ans;
//    }
//    public void dfs(int cur, int[] nums){
//        if(cur == nums.length){
//            ans.add(new ArrayList<>(path));
//            return;
//        }
//        path.add(nums[cur]);
//        dfs(cur + 1, nums);
//        path.remove(path.size() - 1);
//        dfs(cur + 1, nums);
//    }
    //迭代法实现子集枚举
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for(int i = 0;i < (1 << n);i++){
            path.clear();
            for(int j = 0;j < n;j++){
                if((i & (1 << j)) != 0){
                    path.add(nums[j]);
                }
            }
            ans.add(new ArrayList<>(path));
        }
        return ans;
    }
}
