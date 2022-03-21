class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        set<int> s;
        for(int i=0;i<nums.size();i++)
        {
            s.insert(nums[i]);
        }
        
        for(int i=0;i<=nums.size();i++)
        {
            if(s.count(i+1)==false)
                return i+1;
        }
        return 0;
    }
};