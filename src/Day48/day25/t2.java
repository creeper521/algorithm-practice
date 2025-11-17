package Day48.day25;

import java.util.ArrayList;

public class t2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param schedule int整型二维数组
     * @return bool布尔型
     */

    public boolean hostschedule(ArrayList<ArrayList<Integer>> schedule) {
        if (schedule == null || schedule.size() <= 1) {
            return true;
        }

        // 遍历检查是否重叠
        for (int i = 1; i < schedule.size(); i++) {
            int prevEnd = schedule.get(i - 1).get(1);
            int currStart = schedule.get(i).get(0);

            // 如果当前开始时间 < 前一个结束时间，则重叠
            if (currStart < prevEnd) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

}
