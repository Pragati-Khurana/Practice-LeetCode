class Solution {
    public int majorityElement(int[] nums) {
        int target = nums.length/2;
        int count = 1;
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1])
                count++;
            else {
                if(count > target)
                    return nums[i];
                else
                    count = 1;
            }
        }
        if(count > target)
                return nums[i];
        return -1;
    }
}