import java.util.Arrays;

class Solution {
    public void reverse (int[] nums, int l, int r) {
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
    public boolean check(int[] nums) {
        int[] sortedArr = nums.clone();
        Arrays.sort(sortedArr);
        int[] oriArr = nums.clone();

        for(int i=0;i<nums.length;i++) {
            int k = i + 1;
            nums = oriArr.clone();
            reverse(nums, 0, nums.length-k-1);
            reverse(nums, nums.length-k, nums.length-1);
            reverse(nums, 0, nums.length-1);

            if(Arrays.equals(nums,sortedArr))
                return true;
        }
        return false;
    }
}