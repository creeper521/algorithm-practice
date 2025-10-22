package 模拟;

public class t1 {
    public String convert(String s, int numRows) {
        if(numRows == 1){return s;}
        int d = 2 * (numRows - 1), n = s.length();
        StringBuilder ans = new StringBuilder();

        for(int i = 0;i < n;i += d){
            ans.append(s.charAt(i));
        }

        for(int k = 1;k < numRows - 1;k++){
            for(int i = k, j = d - k;i < n || j < n;i += d, j += d){
                if(i < n)ans.append(s.charAt(i));
                if(j < n)ans.append(s.charAt(j));
            }
        }
        for(int i = numRows - 1;i < n;i += d){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
