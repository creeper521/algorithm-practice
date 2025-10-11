package 动态规划;

public class t7 {

    public int num;
    public int numDecodings(String s) {
        int n = s.length();
        char[] ss = s.toCharArray();
        int[] dp = new int[n];
        //初始化第一位
        if(ss[0] != '0'){dp[0] = 1;}
        if(n == 1){return dp[0];}

        //初始化第二位
        if(ss[1] != '0' && ss[0] != '0'){dp[1]++;}
        num = 10 * (ss[0] - '0') + (ss[1] - '0');
        if(num >= 10 && num <= 26){dp[1]++;}

        for(int i = 2; i < n; i++){
            if(ss[i] != '0'){dp[i] = dp[i - 1];}
            num = 10 * (ss[i - 1] - '0') + (ss[i] - '0');
            if(num >= 10 && num <= 26){dp[i] += dp[i - 2];}
        }
        return dp[n - 1];
    }
}
