package Day48.day25;

import java.util.Arrays;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] arr = new int[26];
        int maxn = 0, minn = Integer.MAX_VALUE;
        for(int i = 0;i < str.length();i++){
            arr[str.charAt(i) - 'a']++;
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                maxn = Math.max(maxn, arr[i]);
                minn = Math.min(minn, arr[i]);
            }
        }
        if(judge(maxn - minn)){
            System.out.println("Lucky Word");
            System.out.println(maxn - minn);
        }else{
            System.out.println("No Answer");
            System.out.println(0);
        }
    }

    private static boolean judge(int num) {
        if(num == 1 || num == 0)return false;
        if(num % 2 == 0 && num != 2)return false;
        if(num % 3 == 0 && num != 3)return false;

        for(int i = 2 ;i < num;i++){
            if(num % i == 0)return false;
        }
        return true;
    }
}
