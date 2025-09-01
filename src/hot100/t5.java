package hot100;

public class t5 {
    //左右双指针
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, ans = (right - left) * Math.min(height[left],height[right]);
        while(left < right){
            if(height[left] <= height[right]){
                left++;
                ans = Math.max(ans, (right - left) * Math.min(height[left],height[right]));
            }else{
                right--;
                ans = Math.max(ans, (right - left) * Math.min(height[left],height[right]));
            }
        }
        return ans;
    }
}
