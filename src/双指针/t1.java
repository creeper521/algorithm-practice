package 双指针;

import java.util.HashSet;

//https://leetcode.cn/problems/happy-number/description/

public class t1 {
//    public int happy(int n){
//        int res = 0;
//        while(n != 0){
//            res += (n % 10) * (n % 10);
//            n /= 10;
//        }
//        return res;
//    }
//
//    public boolean isHappy(int n) {
//        HashSet <Integer> set = new HashSet<>();
//        int ans = n;
//        while(true){
//         ans = happy(ans);
//         if(ans == 1){
//             return true;
//         }
//         if(set.contains(ans)){
//             return false;
//         }
//            set.add(ans);
//        }
//    }

    public int bitSquareSum(int n) {
        int sum = 0;
        while(n > 0)
        {
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
        }while(slow != fast);

        return slow == 1;
    }
}

