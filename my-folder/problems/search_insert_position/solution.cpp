class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int mid = nums.size()/2;
        int res;
        
        if(nums[mid]==target)
            res = mid;
        else if(nums[mid]>target)
        {
            auto it = find(nums.begin(), nums.begin()+mid, target);
            if (it != nums.begin()+mid)
                res = it - nums.begin();
            else
                res = (upper_bound(nums.begin(), nums.begin()+mid, target))-nums.begin();
        }
        else if(nums[mid]<target)
        {
            res = (lower_bound(nums.begin()+mid, nums.end(), target))-nums.begin();
        }
        return res;
    }
};