class Solution {
    public int findMin(int[] nums) {
        int l=0, h=nums.length-1, mid, mini=Integer.MAX_VALUE;

        while(l<=h) {
            if(nums[l]<=nums[h])
                mini=Math.min(mini, nums[l]);

            mid=l+(h-l)/2;
            if(nums[mid]>=nums[l]) {
                mini=Math.min(mini, nums[l]);
                l=mid+1;
            }
            else {
                mini=Math.min(mini, nums[mid]);
                h=mid-1;
            }
        }
        return mini;
    }
}