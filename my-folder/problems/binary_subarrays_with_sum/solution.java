class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0, sum=0;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(sum == goal)
                count++;

            if(m.containsKey(sum-goal))
                count += m.get(sum-goal);

            m.put(sum, m.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}