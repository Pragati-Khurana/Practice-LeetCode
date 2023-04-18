class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        while(goal>0 || start>0) {
            if((goal&1)!=(start&1)) {
                count++;
            }
            goal = goal>>1;
            start = start>>1;
        }
        return count;
    }
}