package 贪心;

//https://leetcode.cn/problems/lemonade-change/
public class t1 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        int n = bills.length;
        for(int i = 0; i < n; i++){
            if(bills[i] == 5){
                five++;
            }else if(bills[i] == 10){
                ten++;
                if(five < 1){
                    return false;
                }
                five--;
            }else{
                twenty++;
                if(ten > 0 && five > 0){
                    five--;
                    ten--;
                }else if(five > 2){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
