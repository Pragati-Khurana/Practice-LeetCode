class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC = 0;
        int curC = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1)
                curC++;
            else {
                if(curC > maxC)
                    maxC = curC;
                curC = 0;
            }
        }
        if(curC > maxC)
            maxC = curC;
        return maxC;
    }
}