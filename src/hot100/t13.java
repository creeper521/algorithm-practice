package hot100;

public class t13 {
    //暴力TLE
//    public int maxSubArray(int[] nums) {
//        int n = nums.length, ans = Integer.MIN_VALUE;
//
//        if(n == 1)return nums[0];
//
//        int[] numSum = new int[n + 1];
//        numSum[0] = 0;
//        for(int i = 1;i <= n;i++){
//            numSum[i] = numSum[i - 1] + nums[i - 1];
//        }
//        for(int i = 1;i <= n;i++){
//            for(int j = 0;j < i;j++){
//                ans = Math.max(numSum[i] - numSum[j], ans);
//            }
//        }
//        return ans;
//    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

}
