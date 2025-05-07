package 前缀和;

//https://leetcode.cn/problems/matrix-block-sum/description/

public class t7 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;int m = mat[0].length;
        int[][] sum = new int[n + 1][m + 1];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] + mat[i][j] - sum[i][j];
            }
        }
        int[][]ans = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                int r1 = i - k < 0 ? 0 : i - k;
                int r2 = i + k >= n ? n - 1 : i + k;
                int c1 = j - k < 0 ? 0 : j - k;
                int c2 = j + k >= m ? m - 1 : j + k;
                ans[i][j] = sum[r2 + 1][c2 + 1] - sum[r2 + 1][c1] - sum[r1][c2 + 1] + sum[r1][c1];
            }
        }
        return ans;
    }
}
