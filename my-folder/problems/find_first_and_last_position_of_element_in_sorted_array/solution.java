class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, h=nums.length-1, mid=0;
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int flag = 0;
        
        while(l <= h) {
            mid = h + (l-h)/2;
            if(nums[mid] == target) {
                res[0] = mid;
                h = mid - 1;
            }
            else if(target > nums[mid])
                l = mid + 1;
            else if(target < nums[mid])
                h = mid - 1;
        }
        
        l=0; h=nums.length-1; mid=0;
        while(l<=h) {
            mid = h + (l-h)/2;
            if(nums[mid] == target) {
                res[1] = mid;
                l = mid + 1;
            }
            else if(target > nums[mid])
                l = mid + 1;
            else if(target < nums[mid])
                h = mid - 1;
        }
        return res;
    }
}