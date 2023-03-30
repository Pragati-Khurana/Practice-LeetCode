class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0, h=nums.length-2, mid;

        while(l<=h) {
            mid=l+(h-l)/2;
            if(mid%2==0) {
                if(nums[mid]==nums[mid+1])
                    l=mid+1;
                else
                    h=mid-1;
            } else {
                if(nums[mid]==nums[mid+1])
                    h=mid-1;
                else
                    l=mid+1;
            }
        }
        return nums[l];
    }
}