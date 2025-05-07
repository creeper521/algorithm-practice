package 二分查找;

//https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/description/

public class t8 {
//    public int takeAttendance(int[] records) {
//        int ans = records.length;
//        for(int i = 0;i < records.length;i++){
//            if(records[i] != i){
//                ans = i;
//                break;
//            }
//        }
//        return ans;
//    }

    public int takeAttendance(int[] records) {
        int ans = records.length;
        int l = 0,r = records.length - 1;
        int mid = 0;
        while(l <= r){
            mid = (l + r) / 2;
            if(records[mid] == mid){
                l = mid + 1;
            }else{
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }

}
