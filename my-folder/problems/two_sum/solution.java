class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int rem = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            rem = target - nums[i];

            if(m.containsKey(rem)) {
                ans[0] = i;
                ans[1] = m.get(rem);
                return ans;
            }
            m.put(nums[i], i);
        }
        return ans;
    }
}