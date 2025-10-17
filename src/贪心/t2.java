package 贪心;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://leetcode.cn/problems/minimum-operations-to-halve-array-sum/
public class t2 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(
                (a, b) -> b.compareTo(a)
        );
        double sum = 0.0;
        //初始化大根堆
        for (int num : nums){
            pq.offer((double) num);
            sum += num;
        }

        sum /= 2.0;
        int ans = 0;
        while (sum > 0.0){
            double max = pq.poll()/2.0;
            sum -= max;
            pq.offer(max);
            ans++;
        }
        return ans;
    }
}
