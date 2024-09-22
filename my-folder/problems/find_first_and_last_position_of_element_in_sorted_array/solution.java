class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, h=nums.length-1, m;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        //first occurence
        while(l <= h) {
            m = (l+h)/2;
            if(nums[m] == target) {
                ans[0] = m;
                h = m - 1;
            }
            else if(nums[m] < target)
                l = m + 1;
            else
                h = m - 1;
        }

        //last occurence
        l=0;
        h=nums.length-1;
        
        while(l <= h) {
            m = (l+h)/2;

            if(nums[m] == target) {
                ans[1] = m;
                l = m + 1;
            }
            else if(nums[m] < target)
                l = m + 1;
            else
                h = m - 1;
        }
        return ans;
    }
}