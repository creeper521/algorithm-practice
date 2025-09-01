package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class t65 {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int des = nums.length;

        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] > target){
                r = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                des = mid;
                ans.add(mid);
                break;
            }
        }
        // 如果没有找到目标值
        if (des == nums.length) return new int[]{-1, -1};

        // 向左扩展查找相同的值
        int ldes = des - 1;
        while (ldes >= 0 && nums[ldes] == target) {
            ans.add(ldes);
            ldes--;
        }

        // 向右扩展查找相同的值
        int rdes = des + 1;
        while (rdes < nums.length && nums[rdes] == target) {
            ans.add(rdes);
            rdes++;
        }

        // 将List转换为数组并排序
        Collections.sort(ans);

        // 返回最小和最大索引
        if (ans.isEmpty()) {
            return new int[]{-1, -1};
        } else {
            return new int[]{ans.get(0), ans.get(ans.size() - 1)};
        }
    }
}
