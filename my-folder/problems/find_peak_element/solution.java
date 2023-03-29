class Solution {
    public int findPeak(int[] nums, int l, int h) {
        int mid = l+(h-l)/2;
        if((mid==0 || nums[mid]>nums[mid-1]) && (mid==nums.length-1 || nums[mid]>nums[mid+1]))
            return mid;
        else if(mid>0 && nums[mid-1]>nums[mid])
            return findPeak(nums, l, mid-1);
        else
            return findPeak(nums, mid+1, h);
    }

    public int findPeakElement(int[] nums) {
        return findPeak(nums, 0, nums.length-1);
    }
}