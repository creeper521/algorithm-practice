package hot100;

import java.util.*;

public class t19 {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> order = new ArrayList<Integer>();
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return order;
//        }
//        int rows = matrix.length, columns = matrix[0].length;
//        boolean[][] visited = new boolean[rows][columns];
//        int total = rows * columns;
//        int row = 0, column = 0;
//        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//        int directionIndex = 0;
//        for (int i = 0; i < total; i++) {
//            order.add(matrix[row][column]);
//            visited[row][column] = true;
//            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
//            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
//                directionIndex = (directionIndex + 1) % 4;
//            }
//            row += directions[directionIndex][0];
//            column += directions[directionIndex][1];
//        }
//        return order;
//    }

    //优化空间复杂度,四个边界指针
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;

        int rowBegin = 0, rowEnd = matrix.length - 1;
        int colBegin = 0, colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // 向右
            for (int j = colBegin; j <= colEnd; j++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // 向下
            for (int j = rowBegin; j <= rowEnd; j++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // 向左
                for (int j = colEnd; j >= colBegin; j--) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // 向上
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
}
