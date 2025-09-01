package hot100;

public class t4 {
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
//    直接将非0的数字左移即可，再填充剩下的格子为0
//    public void moveZeroes(int[] nums) {
//        int cur = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[cur] = nums[i];
//                cur++;
//            }
//        }
//        for (int i = cur; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }

//    public void moveZeroes(int[] nums) {
//        int n = nums.length, left = 0, right = 0;
//        while (right < n) {
//            if (nums[right] != 0) {
//                // 只有当 left 和 right 不相等时才交换，避免不必要的交换操作
//                if (left != right) {
//                    int temp = nums[left];
//                    nums[left] = nums[right];
//                    nums[right] = temp;
//                    left++;
//                } else {
//                    left++;
//                }
//            }
//            right++;
//        }
//    }

}
