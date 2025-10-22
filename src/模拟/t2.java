package 模拟;
//https://leetcode.cn/problems/count-and-say/

public class t2 {
    public String countAndSay(int n) {
        String ret = "1";
        for(int i = 1;i < n;i++){
            StringBuilder sb = new StringBuilder();
            int len = ret.length();
            for(int l = 0, r = 0;r < len;){
                while(r < len && ret.charAt(l) == ret.charAt(r)){
                    r++;
                }
                sb.append(Integer.toString(r - l));
                sb.append(ret.charAt(l));
                l = r;
            }
            ret = sb.toString();
        }
        return ret;
    }


}
