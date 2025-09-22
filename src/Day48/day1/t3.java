package Day48.day1;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        int i = 0;
        while (i < sb.length() - 1) {
            // 如果当前字符与下一个字符相同
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                // 删除这两个相邻字符
                sb.deleteCharAt(i);
                sb.deleteCharAt(i); // 再删除一次，因为索引发生了变化

                // 回退一步，防止越界并重新检查当前字符是否与前面的字符匹配
                if (i > 0) {
                    i--;
                }
            } else {
                // 如果不相等，继续向右移动指针
                i++;
            }
        }

        System.out.println(sb.toString());
    }
}

