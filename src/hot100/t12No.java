package hot100;

public class t12No {
    public String minWindow(String s, String t) {
        int[] cntS = new int[128];
        int[] cntT = new int[128];
        for(char c : t.toCharArray()){
            cntT[c]++;
        }
        char[] S = s.toCharArray();
        int m = S.length;
        int ansLeft = -1;
        int ansRight = m;

        int left = 0;
        for(int right = 0;right < m;right++){
            cntS[S[right]]++;//右端点字母移入字串
            while(isCover(cntS,cntT)){
                if(right - left < ansRight - ansLeft){
                    ansLeft = left;
                    ansRight = right;
                }
                cntS[S[left]]--;//左端字母移出字串
                left++;
            }
        }
        return ansLeft < 0 ? "" : s.substring(ansLeft,ansRight + 1);
    }

    private boolean isCover(int[] cntS, int[] cntT) {
        for(int i = 'A'; i <='Z'; i++){
            if (cntS[i] < cntT[i]){
                return false;
            }
        }
        for (int i = 'a'; i <='z'; i++){
            if (cntS[i] < cntT[i]){
                return false;
            }
        }
        return true;
    }
}
