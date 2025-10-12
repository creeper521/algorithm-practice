package 动态规划;

public class t15 {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] arr = new int[n];
        for(int x : nums){arr[x] += x;}

        int[] dpYes = new int[n];
        int[] dpNo = new int[n];

        dpYes[0] = arr[0];

        for(int i = 1;i < n;i++){
            dpYes[i] = dpNo[i - 1] + arr[i];
            dpNo[i] = Math.max(dpYes[i - 1], dpNo[i - 1]);
        }
        return Math.max(dpYes[n - 1], dpNo[n - 1]);
    }
}
