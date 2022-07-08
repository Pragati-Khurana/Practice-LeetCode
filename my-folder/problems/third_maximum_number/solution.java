class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]<nums[i+1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[nums.length-1];
        k++;
        
//         Set<Integer> s = new HashSet<>();
//         for(int e : nums) {
//             s.add(e);
//         }
//         int[] na = new int[s.size()];
//         int i=0;
//         for(int v : s) {
//             na[i++] = v;
//         }
        
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        if(k < 3)
            return nums[k-1];
        
        return nums[k-3];
    }
}