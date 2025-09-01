package hot100;

import java.util.Deque;
import java.util.LinkedList;

public class t15 {
    //额外数组
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int[] newArr = new int[n];
//        for (int i = 0; i < n; ++i) {
//            newArr[(i + k) % n] = nums[i];
//        }
//        System.arraycopy(newArr, 0, nums, 0, n);
//    }

    //临时变量储存旋转值TLE
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k %= n;
//
//        if (k == 0) return;
//
//        for (int i = 0; i < k; i++) {
//            int last = nums[n - 1]; // 保存最后一个元素
//            // 所有元素向后移动一位
//            for (int j = n - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = last; // 将保存的最后一个元素放到开头
//        }
//    }

    //三次反转
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }


}
