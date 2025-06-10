package hot100;

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

public class t38 {
    //终于自己憋出来了
//    public TreeNode invertTree(TreeNode root) {
//        if(root == null)return root;
//        turnOver(root);
//        return root;
//    }
//    public void turnOver(TreeNode root){
//        if(root.left == null && root.right == null)return;
//        else if(root.left == null || root.right == null){
//            if(root.left == null){
//                root.left = root.right;
//                root.right = null;
//            }else{
//                root.right = root.left;
//                root.left = null;
//            }
//        }else{
//            TreeNode trans = root.left;
//            root.left = root.right;
//            root.right = trans;
//        }
//        if(root.left != null)turnOver(root.left);
//        if(root.right != null)turnOver(root.right);
//    }
    //官方无敌优化版
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//        root.left = right;
//        root.right = left;
//        return root;
//    }

}
