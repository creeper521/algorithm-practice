package 二分查找;

//https://leetcode.cn/problems/peak-index-in-a-mountain-array/description/
public class t5 {
    public int peakIndexInMountainArray(int[] arr) {
        int ans = -1;
        int l = 0,r = arr.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if (arr[mid] > arr[mid + 1]){
                r = mid - 1;
                ans = mid;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}
