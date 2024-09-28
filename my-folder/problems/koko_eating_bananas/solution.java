class Solution {
    public int maxElement(int[] a) {
        int max = a[0];

        for(int i=1; i<a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    public long calculateTotalHours(int[] a, int hourly) {
        long totalHrs = 0;

        for(int i=0; i<a.length; i++) {
            totalHrs = totalHrs + (long) Math.ceil((double)a[i] / (double)hourly);
        }
        return totalHrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, hi = maxElement(piles), m, ans=1;

        while(l <= hi) {
            m = l+((hi-l)/2);
            long totalHrs = calculateTotalHours(piles, m);

            if(totalHrs <= h) {
                ans = m;
                hi = m-1;
            } else
                l = m+1;
        }
        return ans;
    }
}