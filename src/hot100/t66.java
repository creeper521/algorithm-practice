package hot100;

public class t66 {
    public int search(int[] nums, int target) {
        int min = 0, n = nums.length;
        for(int l = 1,r = n - 1;l <= r;){
            int num = (l + r) / 2;
            if(nums[0] < nums[num])l = num + 1;
            else{
                r = num - 1;min = num;
            }
        }
        int left = min, right = min + n - 1;
        while(left <= right){
            int mid = ((left + right) / 2) % n;
            if(target < nums[mid]) right = mid - 1;
            else if(target > nums[mid])left = mid + 1;
            else return mid;
        }
        return -1;
    }
}
