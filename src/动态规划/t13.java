package 动态规划;

public class t13 {
    public int massage(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int[] dpYes = new int[n];
        int[] dpNo = new int[n];

        dpYes[0] = nums[0];
        dpNo[0] = 0;

        for (int i = 1; i < n; i++){
            dpYes[i] = dpNo[i - 1] + nums[i];
            dpNo[i] = Math.max(dpYes[i - 1], dpNo[i - 1]);
        }
        return Math.max(dpYes[n - 1], dpNo[n - 1]);
    }
}
