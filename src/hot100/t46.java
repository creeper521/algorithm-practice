package hot100;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class t46 {
    public void flatten(TreeNode root) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        solve(root, ans);
        for(int i = 1; i < ans.size(); i++){
            TreeNode pre = ans.get(i - 1);
            TreeNode cur = ans.get(i);
            pre.left = null;
            pre.right = cur;
        }
    }

    private void solve(TreeNode root, List<TreeNode> ans) {
        if(root != null){
            ans.add(root);
            solve(root.left, ans);
            solve(root.right, ans);
        }
    }
}
