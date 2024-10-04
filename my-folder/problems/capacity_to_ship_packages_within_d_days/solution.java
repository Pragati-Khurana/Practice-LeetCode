class Solution {
    public int countDays(int[] w, int d, int m) {
        int countD=0;
        int sum=0;
        for(int i=0; i<w.length; i++) {
            sum += w[i];
            if(w[i] > m)
                return 2;
            if(sum > m) {
                countD++;
                sum = w[i];
            }
            if(sum==m) {
                countD++;
                sum=0;
            }
        }

        if(sum<m && sum!=0)
            countD++;
        
        if(countD == d)
            return 1;
        if(countD <= d)
            return 0;
        return 2;
    }

    public int maxW(int[] w) {
        int sum=0;
        for(int i=0; i<w.length; i++)
            sum += w[i];
        return sum;
    }

    public int shipWithinDays(int[] weights, int days) {
        int l=1, h=maxW(weights), m, ans=-1;

        // if(days == 1)
        //     return h;

        while(l <= h) {
            m = (l+h)/2;
            
            int cd = countDays(weights, days, m);

            if(cd == 1 || cd == 0) {
                ans = m;
                h = m-1;
            }
            else
                l = m+1;
        }
        return ans;
    }
}