package 动态规划;

public class t14 {
    public int rob(int[] nums) {
        int n = nums.length, ans1 = 0, ans2 = 0;
        int[] dpYes = new int[n];
        int[] dpNo = new int[n];

        if(n == 1){return nums[0];}

        dpYes[0] = nums[0];

        for (int i = 1; i < n - 1; i++){
            dpYes[i] = dpNo[i - 1] + nums[i];
            dpNo[i] = Math.max(dpYes[i - 1], dpNo[i - 1]);
        }
        ans1 = Math.max(dpYes[n - 2], dpNo[n - 2]);


        int[] dpYes1 = new int[n];
        int[] dpNo1 = new int[n];
        dpYes1[1] = nums[1];
        for (int i = 2; i < n; i++){
            dpYes1[i] = dpNo1[i - 1] + nums[i];
            dpNo1[i] = Math.max(dpYes1[i - 1], dpNo1[i - 1]);
        }
        ans2 = Math.max(dpYes1[n - 1], dpNo1[n - 1]);
        return Math.max(ans1, ans2);
    }

    //优化版本
    public int rob1(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        // 情况 1：考虑第一个房屋，但不考虑最后一个房屋
        int a1 = nums[0];
        int b1 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n - 1; i++) {
            int temp = b1;
            b1 = Math.max(b1, a1 + nums[i]);
            a1 = temp;
        }

        int ans1 = Math.max(a1, b1);

        // 情况 2：考虑第二个房屋，但不考虑最后一个房屋
        int a2 = nums[1];
        int b2 = Math.max(nums[1], nums[2]);
        for (int i = 3; i < n; i++) {
            int temp = b2;
            b2 = Math.max(b2, a2 + nums[i]);
            a2 = temp;
        }

        int ans2 = Math.max(a2, b2);

        // 返回两种情况的最大值
        return Math.max(ans1, ans2);
    }

}
