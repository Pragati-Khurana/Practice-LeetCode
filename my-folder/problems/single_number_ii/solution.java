class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            if(h.containsKey(nums[i])) {
                int val = h.get(nums[i]);
                val++;
                h.put(nums[i], val);
            }
            else {
                h.put(nums[i], 1);
            }
        }
        
        for(Integer v: h.keySet()) {
            if(h.get(v)==1)
                return v;
        }
        return 0;
    }
}