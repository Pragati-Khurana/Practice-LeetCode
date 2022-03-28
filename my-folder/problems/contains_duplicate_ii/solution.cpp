class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int, int> m;
        for(int i=0;i<nums.size();i++)
        {
            if(m.find(nums[i])!=m.end())
            {
                int r = abs(i-m.at(nums[i]));
                if(r<=k)
                    return true;
                else
                    m[nums[i]] = i;
            }
            else
                m[nums[i]] = i;
        }
        return false;
    }
};