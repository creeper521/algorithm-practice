package Day48.day1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt(), right = sc.nextInt();
        int ans = 0;
        for(int i = left; i <= right; i++){
            ans += solve(i);
        }
        System.out.println(ans);
    }

    private static int solve(int i) {
        int sum = 0;
        while(i != 0){
            int temp = i % 10;
            if(temp == 2){
                sum++;
            }
            i /= 10;
        }
        return sum;
    }

}
