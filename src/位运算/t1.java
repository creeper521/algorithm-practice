package 位运算;
//https://leetcode.cn/problems/is-unique-lcci/
public class t1 {
    public boolean isUnique(String astr) {
        int len = astr.length();
        if(len > 26){
            return false;
        }
        int num = 0;
        for(int i = 0;i < len;i++){
            char c = astr.charAt(i);
            int index = c - 'a';
            if((num & (1 << index)) != 0){
                return false;
            }else{
                num |= (1 << index);
            }
        }
        return true;
    }
}
