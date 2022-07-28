class Solution {
    public int[] dailyTemperatures(int[] t) {
        int cnt;
        int[] ans = new int[t.length];
        for(int i=0;i<t.length;i++) {
            cnt = 1;
            for(int j=i+1;j<t.length;j++) {
                if(t[j]>t[i]) {
                    ans[i] = cnt;
                    break;
                }
                else
                    cnt++;
            }
        }
        return ans;   
    }
}