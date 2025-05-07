package 双指针;

//和为s的两个数字
import java.util.*;
import java.util.ArrayList;
public class t4 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0,j = array.length - 1;
        while(i < j){
            if(array[i] + array[j] == sum){
                ans.add(array[i]);
                ans.add(array[j]);
                return ans;
            }
            else if(array[i] + array[j] > sum){
                j--;
            }
            else if(array[i] + array[j] < sum){
                i++;
            }
        }
        return ans;
    }
}
