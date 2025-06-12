package hot100;

public class t64 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i < matrix.length - 1;i++){
            if (target >= matrix[i][0] && target < matrix[i + 1][0]){
                return check(matrix[i], target);
            }
        }
        if(check(matrix[matrix.length - 1], target))return true;
        return false;
    }
    boolean check(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
