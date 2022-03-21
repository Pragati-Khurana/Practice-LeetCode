class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        set<int> s;
        for(int i=0;i<nums.size();i++)
        {
            if(s.insert(nums[i]).second==false)
                return nums[i];
        }
        return 0;
    }
};