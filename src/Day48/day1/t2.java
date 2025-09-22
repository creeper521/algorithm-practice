package Day48.day1;

import java.util.*;


public class t2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums1 int整型ArrayList
     * @param nums2 int整型ArrayList
     * @return int整型ArrayList
     */
    public ArrayList<Integer> intersection (ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(nums1.size() == 0 || nums2.size() == 0){
            return ans;
        }
        int n = nums1.size();
        for(int i = 0; i < n; i++){
            if(nums2.contains(nums1.get(i)) && !ans.contains(nums1.get(i))){
                ans.add(nums1.get(i));
            }
        }
        return ans;
    }
}
