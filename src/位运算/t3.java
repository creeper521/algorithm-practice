package 位运算;
//https://leetcode.cn/problems/sum-of-two-integers/
public class t3 {
    public int getSum(int a, int b) {
        while(b != 0){
            int trans = (a & b) << 1;
            a = a ^ b;
            b = trans;
        }
        return a;
    }
}
