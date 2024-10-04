class Solution {
    public int divisionSum(int[] a, int t, int m) {
        int sum=0;
        for(int i=0; i<a.length; i++) {
            sum += (int) Math.ceil((double) a[i]/(double) m);
        }
        if(sum <= t)
            return 1;
        // if(sum <= t)
        //     return 0;
        return 2;
    }

    public int findMax(int[] nums) {
        int maxi = nums[0];
        for(int i=1; i<nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        return maxi;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int l=1, h=findMax(nums), m, ans=-1;;

        while(l <= h) {
            m = (l+h)/2;

            if(divisionSum(nums, threshold, m) == 1) {
                ans = m;
                h = m-1;
            } else
                l = m+1;
        }
        return ans;
    }
}