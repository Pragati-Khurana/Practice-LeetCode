class Solution {
    public boolean check(int[] nums) {
        int flag = 0;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                if(flag == 0) {
                    flag=1;
                    int k = i + 1;
                    while(k < nums.length) {
                        if(nums[k] > nums[0])
                            return false;
                        k++;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}