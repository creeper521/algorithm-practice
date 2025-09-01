package 动态规划;
//https://leetcode.cn/problems/climbing-stairs/description/?envType=problem-list-v2&envId=dynamic-programming
public class t1 {
    public int climbStairs(int n) {
        int[]ans = new int[n + 1];
        if(n == 1)return 1;
        if(n == 2)return 2;
        ans[1] = 1;ans[2] = 2;
        for(int i = 3;i < n + 1;i++){
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }
}
