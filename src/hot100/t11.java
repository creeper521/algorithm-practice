package hot100;

import java.util.*;

public class t11 {
    //大根堆处理
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int n = nums.length;
//        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
//            }
//        });
//        for(int i = 0;i < k;i++){
//            queue.offer(new int[]{nums[i], i});
//        }
//        int[] ans = new int[n - k + 1];
//        ans[0] = queue.peek()[0];
//        for(int i = k;i < n;i++){
//            queue.offer(new int[]{nums[i], i});
//            while(queue.peek()[1] <= i - k){
//                queue.poll();//检查队首元素是否还在当前范围内
//            }
//            ans[i - k + 1] = queue.peek()[0];
//        }
//        return ans;
//    }

    //双端队列处理
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i = 0;i < k;i++){
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] ans = new int[n - k + 1];
        ans[0] = nums[deque.peekFirst()];
        for(int i = k;i < n;i++){
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            while(deque.peekFirst() <= i - k){
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }

}
