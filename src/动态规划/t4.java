package 动态规划;

import java.util.Scanner;
//https://leetcode.cn/problems/n-th-tribonacci-number/
public class t4 {
    public int tribonacci(int n) {
        int[] ans = new int[40];
        ans[0] = 0; ans[1] = 1; ans[2] = 1;
        if(n > 2){
            for(int i = 2; i < n;i++){
                ans[i + 1] = ans[i] + ans[i - 1] + ans[i - 2];
            }
        }
        return ans[n];
    }
}
