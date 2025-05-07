package 双指针;

public class t2 {
//    public int maxArea(int[] height) {
//        int i = 0,j = height.length - 1;
//        int area = 0;
//        while(i != j){
//            area = Math.max(area(i,j,height),area);
//            if((height[j] - height[i]) <= 0)j--;
//            else i++;
//        }
//        return area;
//    }
//
//    public int area(int a,int b,int[] height){
//        return Math.min(height[a],height[b]) * Math.abs(b - a);
//    }
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while(i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }
}
