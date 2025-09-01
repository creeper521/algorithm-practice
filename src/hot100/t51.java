package hot100;

public class t51 {

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)return 0;

        int m = grid.length, n = grid[0].length, ans = 0;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == '1'){
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }
    void dfs(char[][] grid, int x, int y){
        int m = grid.length, n = grid[0].length;

        if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == '0')return ;
        grid[x][y] = '0';
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }

}
