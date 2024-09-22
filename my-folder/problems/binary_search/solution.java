class Solution {
    public int BST(int[] nums, int l, int h, int target) {
        int m = (l + h) / 2;
        if(l>h)
            return -1;
        else if(nums[m] == target)
            return m;
        else if(nums[m] > target)
            return BST(nums, l, m-1, target);
        else
            return BST(nums, m+1, h, target);
    }

    public int search(int[] nums, int target) {
        return BST(nums, 0, nums.length-1, target);
    }
}