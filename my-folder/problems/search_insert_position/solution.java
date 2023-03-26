class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, h=nums.length-1,floor=0;
        while(l<=h) {
            int mid=(l+h)/2;
            if(target > nums[mid]) {
                l=mid+1;
                floor=mid+1;
            } else if(target < nums[mid]) {
                h=mid-1; 
            } else {
                return mid;
            }
        }
        return floor;
    }
}