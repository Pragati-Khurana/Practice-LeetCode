class Solution {
    public int search(int[] nums, int target) {
        int l=0, h=nums.length-1, m;

        while(l <= h) {
            m = (l+h)/2;

            if(nums[m] == target)
                return m;
            
            if(nums[m] >= nums[l]) {
                if(target >= nums[l] && target <= nums[m])
                    h = m-1;
                else
                    l = m+1;
            } else if(nums[m] <= nums[h]) {
                if(target >= nums[m] && target <= nums[h])
                    l = m+1;
                else
                    h = m-1;
            }
        }
        return -1;
    }
}