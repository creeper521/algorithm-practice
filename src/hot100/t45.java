package hot100;

import java.util.*;

public class t45 {
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        int max_depth = -1;

        Deque<TreeNode> nodeStack = new LinkedList<TreeNode>();
        Deque<Integer> depthStack = new LinkedList<Integer>();
        nodeStack.push(root);
        depthStack.push(0);
        while(!nodeStack.isEmpty()){
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();
            if(node != null){
                max_depth = Math.max(max_depth, depth);
                if(!map.containsKey(depth)){
                    map.put(depth, node.val);
                }
                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i <= max_depth;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
