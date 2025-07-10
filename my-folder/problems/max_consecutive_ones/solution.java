class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, maxC=0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1)
                count++;
            if(nums[i] != 1) {
                maxC = Math.max(count, maxC);
                count=0;
            }
        }
        maxC = Math.max(count, maxC);

        return maxC;
    }
}