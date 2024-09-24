class Solution {
    public boolean search(int[] nums, int target) {
        int l=0, h = nums.length-1, m;

        while(l <= h) {
            m = (l+h)/2;

            if(nums[m] == target)
                return true;

            if(nums[l] == nums[m] && nums[m] == nums[h]) {
                l = l+1;
                h = h-1;
                continue;
            }

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
        return false;
    }
}