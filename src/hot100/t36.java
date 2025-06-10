package hot100;

import java.util.*;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//  }
//}

public class t36 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        Deque<TreeNode> deque = new LinkedList<>();
//        while(root != null || !deque.isEmpty()){
//            while(root != null){
//                deque.push(root);
//                root = root.left;
//            }
//            root = deque.pop();
//            ans.add(root.val);
//            root = root.right;
//        }
//        return ans;
//    }
    //递归
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        order(root, ans);
//        return ans;
//    }
//    public void order(TreeNode root, List<Integer> ans){
//        if(root == null)return;
//        order(root.left, ans);
//        ans.add(root.val);
//        order(root.right, ans);
//    }
}
