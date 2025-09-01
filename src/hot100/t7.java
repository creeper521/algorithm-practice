package hot100;

import java.util.Deque;
import java.util.LinkedList;

public class t7 {
    //动态规划
//    public int trap(int[] height) {
//        int n = height.length;
//        if (n == 0) {
//            return 0;
//        }
//
//        int[] leftMax = new int[n];
//        leftMax[0] = height[0];
//        for(int i = 1;i < n;i++){
//            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
//        }
//
//        int[] rightmax = new int[n];
//        rightmax[n - 1] = height[n - 1];
//        for(int i = n - 2;i >= 0;i--){
//            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
//        }
//
//        int ans = 0;
//        for(int i = 0;i < n;i++){
//            ans += Math.min(rightmax[i], leftMax[i]) - height[i];
//        }
//        return ans;
//    }

    //单调栈
//    public int trap(int[] height) {
//        int ans = 0;
//        Deque<Integer> stack = new LinkedList<>();
//        int n = height.length;
//        for(int i = 0;i < n;i++){
//            while(!stack.isEmpty() && height[i] > height[stack.peek()]){
//                int top = stack.pop();
//                if(stack.isEmpty())break;
//                int left = stack.peek();
//                int nowWidth = i - left - 1;
//                int nowHeight = Math.min(height[i], height[left]) - height[top];
//                ans += nowWidth * nowHeight;
//            }
//            stack.push(i);
//        }
//        return ans;
//    }

    //双指针
//    public int trap(int[] height) {
//        int ans = 0;
//        int left = 0, right = height.length - 1;
//        int leftMax = 0, rightMax = 0;
//        while (left < right) {
//            leftMax = Math.max(leftMax, height[left]);
//            rightMax = Math.max(rightMax, height[right]);
//            if (height[left] < height[right]) {
//                ans += leftMax - height[left];
//                ++left;
//            } else {
//                ans += rightMax - height[right];
//                --right;
//            }
//        }
//        return ans;
//    }



}
