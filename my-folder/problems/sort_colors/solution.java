class Solution {
    public void sortColors(int[] nums) {
        int l=0, m = 0;
        int h = nums.length-1;

        while(m <= h) {
            if(nums[m] == 0) {
                nums[m] = nums[l];
                nums[l] = 0;
                m++;
                l++;
            } else if(nums[m] == 1) {
                m++;
            } else {
                nums[m] = nums[h];
                nums[h] = 2;
                h--;
            }
        }
    }
}