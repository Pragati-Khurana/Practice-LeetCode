class Solution {
    public void reverse(int[] nums, int l, int r) {
        if(l >= r)
            return;
        
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

        reverse(nums, l+1, r-1);
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
}