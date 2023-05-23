class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0, maxCount=0, start=0, k1=k;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                if(k1!=0) {
                    k1--;
                    count++;
                } else {
                    maxCount = Math.max(count, maxCount);
                    while(nums[start]!=0) {
                        count--;
                        start++;
                    }
                    start++;
                }
            } else {
                count++;
            }
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}