class Solution {
    public int search(int[] nums, int target) {
        int l=0, h=nums.length-1, mid;
        while(l<=h) {
            mid = l+(h-l)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>=nums[l]) {
                if(target<=nums[mid] && target>=nums[l])
                    h=mid-1;
                else
                    l=mid+1;
            }
            else {
                if(target>=nums[mid] && target<=nums[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
        }
        return -1;
    }
}