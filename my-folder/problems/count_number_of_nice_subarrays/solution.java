class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum=0, count=0;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2 == 0)
                sum += 0;
            else
                sum += 1;

            if(sum==k)
                count++;

            //System.out.println("sum:" + sum);
            int rem = sum-k;
            if(m.containsKey(rem))
                count = count + m.get(rem);

            //System.out.println("count:" + count);

            
            m.put(sum, m.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}