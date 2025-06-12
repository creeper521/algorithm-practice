package hot100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class t52 {
    int[] dx = new int[]{-1, 0, 1, 0};
    int[] dy = new int[]{0, 1, 0, -1};
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Deque<Integer> deque = new ArrayDeque<>();//linklist也行
        HashMap<Integer, Integer>depth = new HashMap<>();
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if (grid[i][j] == 2){
                    int code = i * n + j;
                    deque.add(code);
                    depth.put(code, 0);
                }
            }
        }
        int ans = 0;
        while (!deque.isEmpty()){
            int code = deque.remove();
            int x = code / n, y = code % n;
            for(int i = 0;i < 4;i++){
                int nowX = x + dx[i];
                int nowY = y + dy[i];
                if(nowX >= 0 && nowY >= 0 && nowX < m && nowY < n && grid[nowX][nowY] == 1){
                    grid[nowX][nowY] = 2;
                    int newCode = nowX * n + nowY;
                    deque.add(newCode);
                    depth.put(newCode, depth.get(code) + 1);
                    ans = depth.get(newCode);
                }
            }
        }
        for(int[] row : grid){
            for(int elem : row){
                if(elem == 1)return -1;
            }
        }
        return ans;
    }
}
