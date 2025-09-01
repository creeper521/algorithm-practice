package hot100;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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
//    }
//}

public class t37 {
    //深度优先搜索
//    public int maxDepth(TreeNode root) {
//        if(root == null)return 0;
//        else{
//            int leftMax = maxDepth(root.left);
//            int rightMax = maxDepth(root.right);
//            return Math.max(leftMax, rightMax) + 1;
//        }
//    }
    //广度优先搜索
//    public int maxDepth(TreeNode root) {
//        if(root == null)return 0;
//
//        Deque<TreeNode> deque = new LinkedList<>();
//        deque.offer(root);
//        int ans = 0;
//        while(!deque.isEmpty()){
//            int size = deque.size();
//            while (size > 0) {
//                TreeNode treeNode = deque.poll();
//                if(treeNode.left != null){
//                    deque.offer(treeNode.left);
//                }
//                if(treeNode.right != null){
//                    deque.offer(treeNode.right);
//                }
//                size--;
//            }
//            ans++;
//        }
//        return ans;
//    }
}
