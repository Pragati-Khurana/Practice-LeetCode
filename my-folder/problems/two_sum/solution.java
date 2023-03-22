class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int remaining = target - nums[i];
            if(m.containsKey(remaining)) {
                ans[0] = m.get(remaining);
                ans[1] = i;
                return ans;
            }
            m.put(nums[i], i);
        }
        return ans;
    }
}